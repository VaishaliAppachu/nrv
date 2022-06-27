package com.vtiger.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class GetMonthInString {

	public static void main(String[] args) {
     String date = "19:05:2023";
     DateTimeFormatter fromatter = DateTimeFormatter.ofPattern("dd:MM:yyy");
     LocalDate localdate = LocalDate.parse(date, fromatter);
     System.out.println(localdate.getYear());
	}
}
