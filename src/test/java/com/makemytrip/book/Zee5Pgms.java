package com.makemytrip.book;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zee5Pgms {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    driver.get("https://www.zee5.com/");
    driver.findElement(By.xpath("//a[.='Top 10 in India']")).click();
   // List<WebElement> d = driver.findElements(By.xpath("//h1[.='Top 10 in India']/parent::div[@class='viewAllLanding middleContainer viewAllContinueWatch viewAllMovie']/descendant::div[@class='movieCard card marginRight minutelyUrl zoomCardHover']"));
    //List<WebElement> d = driver.findElements(By.xpath("//div[@class='movieCard card marginRight minutelyUrl zoomCardHover']"));
   // for (WebElement d2 : d) 
   // {
	
	
	List<WebElement> movie = driver.findElements(By.xpath("//h3[@class='popupTitle   undefined ']"));
	for (WebElement data:movie)
	{
		Actions act = new Actions(driver);
		act.moveToElement(data).pause(1000).perform();
		System.out.println(data.getText());
	}
	}
	
}
