package com.pkg.visitedLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class searchingTotalLink {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void setUp() {
		
	}
	
	@Test
	public void SearchTotalLink() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium webdriver");
		
		//get all the search result
		List<WebElement> allSearchResult = driver.findElements(By.xpath(".//*[@id='rso']//h3/a"));
				
		//iterate the above list to get all the search titles & links from that page
		for(WebElement eachResult : allSearchResult) {
			System.out.println("Total list: " + eachResult.getAttribute("href"));
			//System.out.println("Title : " + eachResult.getText() + ", Link : " + eachResult.getAttribute("href"));
		}
		
	}

}
