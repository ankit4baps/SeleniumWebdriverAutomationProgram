package com.pkg.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement registerLink = null;
	public static WebElement homePage = null;
	
	public static WebElement link_Register(WebDriver Driver) {
		registerLink = Driver.findElement(By.linkText("REGISTER"));
		
		return registerLink;
	}
	
	public static WebElement homePage(WebDriver Driver) {
		homePage = Driver.findElement(By.linkText("Home"));
		return homePage;
	}
}
