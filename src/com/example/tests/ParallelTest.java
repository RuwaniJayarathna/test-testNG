package com.example.tests;

import org.testng.annotations.*;


public class ParallelTest {
  @Test
  public void TC1() throws InterruptedException {
	  for(int i=0;i<10;i++){
		  System.out.println("Method 1 TC1:Iteration"+i);
		  Thread.sleep(1000);
	  }
  }
  
  @Test
  public void TC2() throws InterruptedException {
	  for(int i=0;i<10;i++){
		  System.out.println("Method 1 TC2:Iteration"+i);
		  Thread.sleep(1000);
	  }
  }

  @Test
  public void TC3() throws InterruptedException {
	  for(int i=0;i<10;i++){
		  System.out.println("Method 1 TC3:Iteration"+i);
		  Thread.sleep(1000);
	  }
  }
}
