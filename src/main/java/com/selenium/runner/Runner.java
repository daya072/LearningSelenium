package com.selenium.runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = { "com.selenium.runner","stepdefs" }, features = { "src/test/java/features" })

public class Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@BeforeTest
	public void beforeTest() {
		
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	
	@AfterSuite()
	public void afterSuite(){
		
	}
}
