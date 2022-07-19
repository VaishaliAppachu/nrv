package com.makemytrip.book;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleFrames {

	public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("http://demo.automationtesting.in/Frames.html");
           driver.switchTo().frame("SingleFrame");
           driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	}

}
