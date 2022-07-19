package com.makemytrip.book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sdet34l1.genericUtility.ExcelOffice;
import com.sdet34l1.genericUtility.IconstantPathOffice;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_MyTrip 
{
	
		@Test(dataProvider ="makemytrip")
		public void bookticket(String from, String to) throws InterruptedException 
		{
			
			 WebDriverManager.chromedriver().setup();
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.makemytrip.com/");
		     driver.findElement(By.xpath("//span[.='From']")).click();  
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(from);
		     
		     driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		     driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(to);
		     
		}
		
		@DataProvider
		public Object[][] makemytrip()
		{
			ExcelOffice.openExcel(IconstantPathOffice.MAKEMYTRIP);
			return ExcelOffice.getMultipleDataFromExcel("Sheet1");
		}
}
