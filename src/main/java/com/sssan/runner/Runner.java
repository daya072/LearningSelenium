package com.sssan.runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.sssan.exception.CustomException;
import com.sssan.utils.PropertiesUtil;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = { "com.selenium.runner", "stepdefs" }, features = { "src/test/java/features" })

public class Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeSuite
	public void beforeSuite() throws CustomException {
		PropertiesUtil prop = new PropertiesUtil();
		prop.loadProperties();
		System.setProperty("cucumber.filter.tags", "@uat");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("i am in before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("i am in after test");
	}

	@AfterSuite()
	public void afterSuite() {

	}
}
