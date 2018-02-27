package com.example.tests;

import org.testng.annotations.*;
import org.testng.Assert;


public class NewTest1 {
  @Test(dataProvider = "dp")
  public void f(Integer actual, Integer expected) {
	  Assert.assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 1 },
      new Object[] { 2, 2 },
    };
  }
}
