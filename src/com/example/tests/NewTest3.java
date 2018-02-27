package com.example.tests;

import org.testng.annotations.*;


public class NewTest3 {
  @Test
  public void TC_Login() {
  }
  @Test(dependsOnMethods={"TC_Login"})
  public void TC_CreateEmployee() {
  }
  @Test(dependsOnMethods={"TC_EditEmployee"})
  public void TC_DeleteEmployee() {
  }
  @Test(dependsOnMethods={"TC_Login"})
  public void TC_EditEmployee() {
  }
  

}
