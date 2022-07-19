package com.makemytrip.book;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameFrames_Automation {

	public static void main(String[] args) {
		       WebDriverManager.chromedriver().setup();
		       WebDriver driver=new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       driver.get("http://demo.automationtesting.in/Frames.html");
		       driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();
		       WebElement r = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		       driver.switchTo().frame(r);
		       //driver.switchTo().defaultContent();
		       WebElement r21 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		       driver.switchTo().frame(r21);
		       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		       
		       
	}
}
