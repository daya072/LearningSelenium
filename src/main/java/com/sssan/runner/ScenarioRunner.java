package com.sssan.runner;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

import com.sssan.driver.DriverInit;
import com.sssan.driver.WebdriverManager;
import com.sssan.enums.BrowserType;;

public class ScenarioRunner{
	
	DriverInit driverInit;
	WebDriver driver;
	WebdriverManager webDriverManager;
	public ScenarioRunner(DriverInit driverInit) {
		this.driverInit = driverInit;
	}

	
	@Before
	public void before(Scenario scenario) {
		System.out.println("I am in before");
		String scenarioName= scenario.getName();
		String browserName = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
	    BrowserType browserType = BrowserType.valueOf(browserName.toUpperCase());
		System.out.println("Thisis browser "+browserType);
		System.out.println("Thisis scenario "+scenarioName);
	    if(driverInit.getDriver()==null) {
	    	webDriverManager = new WebdriverManager();
			driver = webDriverManager.getWebdriver(scenarioName,"abc",browserType);
			driverInit.setDriver(driver);
		}
	}

	@BeforeStep
	public void beforeStep(Scenario scenario) {

	}

	@AfterStep
	public void afterStep(Scenario scenario) {

	}

	@After
	public void after(Scenario scenario) {
		driver.quit();
	}
	
	
}
