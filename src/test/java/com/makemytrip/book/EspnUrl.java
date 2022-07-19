package com.makemytrip.book;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EspnUrl {

	public static void main(String[] args) throws InterruptedException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.espncricinfo.com/series/ipl-2021-1249214/points-table-standings");
       Thread.sleep(2000);
       String actual="https://www.espncricinfo.com/series/ipl-2021-1249214/points-table-";
	   String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		if(actual.equals(url))
		{
			System.out.println("matching");
		}
		else {
			System.out.println("not matching");
		}
	}

}
