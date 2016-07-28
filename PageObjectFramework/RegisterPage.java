package com.pkg.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	public static WebElement firstName = null;
	public static WebElement lastName = null;
	public static WebElement phoneNumber = null;
	public static WebElement userName = null;
	public static WebElement address1 = null;
	public static WebElement address2 = null;
	public static WebElement city = null;
	public static WebElement state = null;
	public static WebElement postalcode = null;
	public static WebElement email = null;
	public static WebElement password = null;
	public static WebElement confirmpassword = null;
	
	public static WebElement firstName(WebDriver Driver) {
		firstName = Driver.findElement(By.name("firstName"));
		return firstName;
	}
	
	public static WebElement lastName(WebDriver Driver) {
		lastName = Driver.findElement(By.name("lastName"));
		return lastName;
	}
	
	public static WebElement phoneNumber(WebDriver Driver) {
		phoneNumber = Driver.findElement(By.name("phone"));
		return phoneNumber;
	}
	
	public static WebElement userName(WebDriver Driver) {
		userName = Driver.findElement(By.id("userName"));
		return userName;
	}
	
	public static WebElement address1(WebDriver Driver) {
		address1 = Driver.findElement(By.name("address1"));
		return address1;
	}
	
	public static WebElement address2(WebDriver Driver) {
		address2 = Driver.findElement(By.name("address2"));
		return address2;
	}
	
	public static WebElement city(WebDriver Driver) {
		city = Driver.findElement(By.name("city"));
		return city;
	}
	
	public static WebElement state(WebDriver Driver) {
		state = Driver.findElement(By.name("state"));
		return state;
	}
	
	public static WebElement postalcode(WebDriver Driver) {
		postalcode = Driver.findElement(By.name("postalCode"));
		return postalcode;
	}
	
	public static WebElement email(WebDriver Driver) {
		email = Driver.findElement(By.id("email"));
		return email;
	}
	
	public static WebElement password(WebDriver Driver) {
		password = Driver.findElement(By.name("password"));
		return password;
	}
	
	public static WebElement confirmpassword(WebDriver Driver) {
		confirmpassword = Driver.findElement(By.name("confirmPassword"));
		return confirmpassword;
	}
}
