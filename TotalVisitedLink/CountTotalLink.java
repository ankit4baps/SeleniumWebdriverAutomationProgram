package com.pkg.visitedLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountTotalLink {
	public static String[] links = null; 
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.madewithangular.com/#/");
		
		//identify the total links
		List<WebElement> linkSize = driver.findElements(By.xpath("//a"));
		
		//count total link list
		int linkListCount = linkSize.size();
		
		System.out.println("Total number of all Links count on WebPage : " + linkListCount);
		
		//print the all links from the webpage
		links = new String[linkListCount];
		System.out.println("List of All links: ");
		
		for(int i = 0; i < linkListCount; i++) {
			links[i] = linkSize.get(i).getAttribute("href");
			System.out.println(linkSize.get(i).getAttribute("href"));
		}
		
		//navigate to all link on the webpage
		for(int i = 0; i < linkListCount; i++) {
			driver.navigate().to(links[i]);
			Thread.sleep(2000);
		}
	}
	
	
}
