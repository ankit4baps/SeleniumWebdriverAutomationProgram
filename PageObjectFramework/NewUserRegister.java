package com.pkg.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewUserRegister {
	WebDriver driver = new FirefoxDriver();
	HomePage hp = new HomePage();
	RegisterPage rp = new RegisterPage();
	
	
	 @BeforeClass(alwaysRun = true)
	  public void setUp() {
		 
	 }
	 
	 @Test
	 public void newTourTest() {
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 hp.link_Register(driver).click();
		
		 rp.firstName(driver).sendKeys("Ankit");
		 rp.lastName(driver).sendKeys("Pandya");
		 rp.phoneNumber(driver).sendKeys("1234567890");
		 rp.userName(driver).sendKeys("ank_pan@gmail.com");
		 rp.address1(driver).sendKeys("755 capi ave");
		 rp.address2(driver).sendKeys("Z000");
		 rp.city(driver).sendKeys("Milpitas");
		 rp.state(driver).sendKeys("CA");
		 rp.postalcode(driver).sendKeys("95035");
		 rp.email(driver).sendKeys("ankpan@gmail.com");
		 rp.password(driver).sendKeys("ank");
		 rp.confirmpassword(driver).sendKeys("ank");
		 
		 hp.homePage(driver).click();
	 }
}
