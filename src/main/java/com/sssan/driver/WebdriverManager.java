package com.sssan.driver;

import org.openqa.selenium.WebDriver;

import com.sssan.enums.BrowserType;
import com.sssan.factory.DriverFactoryManager;

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
			//TODO implement remote driver
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
