package com.makemytrip.book;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotStarPgm {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.hotstar.com/in");
    driver.findElement(By.xpath("//a[.='Latest & Trending']")).click();
    List<WebElement> d = driver.findElements(By.xpath("//h2[.='Latest & Trending']/ancestor::div[@class='container']/descendant::div[@class='thumbnail-container']"));
    for (WebElement d1 : d) 
    {
	Actions act = new Actions(driver);
	act.moveToElement(d1).pause(1000).perform();
	
	List<WebElement> d2 = driver.findElements(By.xpath("//span[@class='content-title ellipsise']"));
	for (int i = 0; i < d2.size(); i++)
	{
		System.out.println(d2.get(i).getText());
	}
	}   
	}
}
