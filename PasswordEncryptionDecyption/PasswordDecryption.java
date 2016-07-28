package com.pkg.UserPass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordDecryption {
	
	//Program for Encryption of Password with Web Driver
	//Rediff Sign In Page
	
	//signIn,userName, passWord element define
	public static WebElement signIn = null;
	public static WebElement userName = null;
	public static WebElement passWord = null;
	public static WebElement go = null;
	
	
	//signIn element method body
	public static WebElement signIn(WebDriver driver) {
		signIn = driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]"));
		return signIn;
	}
	
	public static WebElement userName(WebDriver driver) {
		userName = driver.findElement(By.id("login1"));
		return userName;
	}
	
	public static WebElement passWord(WebDriver driver) {
		passWord = driver.findElement(By.id("password"));
		return passWord;
	}
	
	public static WebElement go(WebDriver driver) {
		go = driver.findElement(By.name("proceed"));
		return go;
	}

}
