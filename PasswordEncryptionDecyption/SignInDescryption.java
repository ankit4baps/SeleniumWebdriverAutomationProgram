package com.pkg.UserPass;

import org.apache.commons.codec.binary.Base64;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInDescryption {
	//This page is for framework to enter data
	
	WebDriver driver = new FirefoxDriver();
	PasswordDecryption pd = new PasswordDecryption();
	
	@BeforeTest
	public void setUp() {
		
	}

	@Test
	public void SignInDescryptionTest() {
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		pd.signIn(driver).click();
		
		pd.userName(driver).sendKeys("ankit537");
		
		//logic for Encryption - decryption of password
		byte[] encodedBytes = Base64.encodeBase64("PassWord123".getBytes());
		System.out.println("Encoded Bytes: " + new String(encodedBytes));
		byte[] decodeBytes = Base64.decodeBase64(encodedBytes);
		System.out.println("Decoded Bytes: " + new String(decodeBytes));
		
		pd.passWord(driver).sendKeys(new String(decodeBytes));
		
		pd.go(driver).click();
	}
}
