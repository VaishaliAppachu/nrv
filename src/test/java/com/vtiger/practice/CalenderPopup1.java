package com.vtiger.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup1 {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/");
    driver.manage().window().maximize();
    WebElement ele = driver.findElement(By.name("bdaytime"));
    ele.sendKeys("19052023",Keys.TAB);
    ele.sendKeys("12.30AM");
    
	}
}
