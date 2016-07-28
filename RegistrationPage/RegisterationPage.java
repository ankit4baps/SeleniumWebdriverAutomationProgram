package com.pkg.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRegisterationPage() throws Exception {
    driver.get(baseUrl + "/mercuryregister.php");
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("REGISTER")).click();
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("Ankit");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("P");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("Pandya");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("1234567890");
    driver.findElement(By.id("userName")).clear();
    driver.findElement(By.id("userName")).sendKeys("ank_pan@gmail.com");
    driver.findElement(By.name("address1")).clear();
    driver.findElement(By.name("address1")).sendKeys("755 capi ave");
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys("Z000");
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("Milpitas");
    driver.findElement(By.name("state")).clear();
    driver.findElement(By.name("state")).sendKeys("CA");
    driver.findElement(By.name("postalCode")).clear();
    driver.findElement(By.name("postalCode")).sendKeys("95035");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("ank");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("ank");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("ank");
    driver.findElement(By.name("register")).click();
    driver.findElement(By.linkText("Home")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
