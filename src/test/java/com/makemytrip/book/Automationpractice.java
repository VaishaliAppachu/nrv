package com.makemytrip.book;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationpractice {

	public static void main(String[] args) throws InterruptedException {
			   WebDriverManager.chromedriver().setup();
		       WebDriver driver=new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       driver.get("http://automationpractice.com/index.php");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
		       //Thread.sleep(2000);
		        WebElement a = driver.findElement(By.xpath("//select[@id='id_contact']"));
		        Select s=new Select(a);
		        s.selectByVisibleText("Webmaster");
		        driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\VAISHALI\\Desktop\\upload.txt");
		        driver.findElement(By.id("submitMessage")).click();
	}

}
