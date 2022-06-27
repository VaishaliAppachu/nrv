package com.vtiger.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ipldynamic {
	public static void main(String[] args) {
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//List<WebElement> ele = driver.findElements(By.xpath("//div[@class='cb-col cb-col-84']"));
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']//tr[1]"));
		for( WebElement ele1:ele)
		{
			System.out.println(ele1.getText());
		}
}
}