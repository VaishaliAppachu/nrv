package com.makemytrip.book;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sdet34l1.genericUtility.ExcelOffice;
import com.sdet34l1.genericUtility.IconstantPathOffice;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	@Test(dataProvider ="makemytrip")
	public  void bookTickets(String from, String to) throws InterruptedException 
	{		
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.makemytrip.com/");
	     
	     driver.findElement(By.xpath("//span[.='From']")).click();  
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(from);
	     
	     driver.findElement(By.xpath("//span[.='To']")).click();
	     driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(to);	     
	}	
	@DataProvider
	public Object[][] makemytrip()
	{
		ExcelOffice.openExcel(IconstantPathOffice.MAKEMYTRIP);
		return ExcelOffice.getMultipleDataFromExcel("Sheet1");
	}
}
