package com.pkg.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CmsPoll {
	
	//public WebDriver driver;
	
//	@BeforeTest
//	  public void setUp() throws Exception {
//		 driver = new FirefoxDriver();
//			
//	  }
	
	@Test
	public void CmsPoll() {
		WebDriver driver = new FirefoxDriver();
		//getting url
		driver.get("http://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		
		//finding elements
		driver.findElement(By.xpath(".//*[@id='pollform']/table/tbody/tr[2]/td/input[2]")).click();
		String total = driver.findElement(By.id("mathq2")).getText();
		
		//separeate the string
		String ele1 = total.substring(0,1);
		System.out.println("Element 1: " + ele1);
		String ele2 = total.substring(4,5);
		System.out.println("Element 2: " + ele2);
		
		//total the two elements
		int sum = Integer.parseInt(ele1) + Integer.parseInt(ele2);
		System.out.println("Sum:" + sum);
		String result = Integer.toString(sum);
		
		driver.findElement(By.id("mathuserans2")).sendKeys(result);
		driver.findElement(By.xpath(".//*[@id='pollform']/table/tbody/tr[4]/td/div")).click();
		
		
	}
		
	
}
