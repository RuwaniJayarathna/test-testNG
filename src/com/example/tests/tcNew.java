package com.example.tests;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class tcNew {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	//  System.setProperty("webdriver.gecko.driver", "F:\\Gecko\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

   
  @Test
  public void testTc01() throws Exception {
    driver.get(baseUrl + "/");
    Thread.sleep(3000);
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("user789");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("user789");
    driver.findElement(By.name("login")).click();
    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Paris");
    new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
    driver.findElement(By.name("findFlights")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("reserveFlights")).click();
    assertEquals(driver.findElement(By.xpath("//td[2]/b/font")).getText(), "9/2/2017");
    assertEquals(driver.findElement(By.cssSelector("td.data_center_mono > b > font")).getText(), "9/2/2017");
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
