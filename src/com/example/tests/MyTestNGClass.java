package com.example.tests;

import org.testng.annotations.*;


public class MyTestNGClass {
	
  @Test(dataProvider = "dp")
  public void first(Integer n, String s) {
	  System.out.println("im inside first method");
  }
  @Test(dataProvider = "dp")
  public void second(Integer n, String s) {
	  System.out.println("im inside second method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("im inside before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("im inside after method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
    
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("im inside before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im inside after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("im inside before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("im inside after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("im inside before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("im inside after suite");
  }

}
