package com.hexaware.Maverics_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testng {

	
		// TODO Auto-generated method stub
		//Assertions(Soft assertion and Hard assertion)
		/*	@BeforeSuite
			@BeforeTest
			@BeforeClass
			@BeforeMethod
			@Test
			@AfterMethod
			@AfterClass
			@AfterTest
			@AfterSuite*/
	
	
	
	


	@BeforeSuite
	public void TestBeforeSuite() {
		System.out.print("AB-AS");
	}
	@BeforeSuite
	public void beforesuite2() {
		System.out.println("Test bfeore suite");
	}
	
	@AfterTest
	public void TestAfter() {
		System.out.println("Aftr the test");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("before test");
	}
	
	@Test
	public void Testcase() {
		System.out.println("test");
		
	}
	
	

}

