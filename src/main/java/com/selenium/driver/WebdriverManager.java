package com.selenium.driver;

import org.openqa.selenium.WebDriver;

import com.selenium.enums.BrowserType;
import com.selenium.factory.DriverFactoryManager;

public class WebdriverManager {

	WebDriver driver;
	DriverFactoryManager driverfactoryManager;
	String isLocal;

	public WebDriver getWebdriver(String scenarioName, String Platform, BrowserType Browser) {
		isLocal="YES";
		switch (isLocal.toUpperCase()) {
		case "YES":
			driver = getLocalWebDriver(Browser);
			break;
		case "NO":

			break;

		default:
			break;
		}
		return driver;
	}

	public WebDriver getLocalWebDriver(BrowserType browserType) {
		driverfactoryManager = new DriverFactoryManager();
		return driverfactoryManager.getDriverClassInstance(browserType).setLocalDriver();
	}
}
