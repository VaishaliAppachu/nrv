package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class VtigerdbTest {

	public static void main(String[] args) throws SQLException 
	{
    Driver driver = new Driver();
    DriverManager.registerDriver(driver);
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vtiger", "root", "root");
    Statement statement = connection.createStatement();
    ResultSet result = statement.executeQuery("select * from vtigertab;");
    while(result.next())
    {
		System.out.println(result.getString(1));
    }
    connection.close();
	}

}
