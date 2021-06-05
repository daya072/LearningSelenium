package com.selenium.factory;

import com.selenium.driver.ManageChromeDriver;
import com.selenium.driver.ManageIEDriver;
import com.selenium.enums.BrowserType;
import com.selenium.interfaces.ISeleniumDriver;

public class DriverFactoryManager {
	
	
	public ISeleniumDriver getDriverClassInstance(BrowserType browserType) {
		
		ISeleniumDriver seleniumDriver=null;
		switch (browserType) {
		case CHROME:
			seleniumDriver = new ManageChromeDriver();
			break;
		case IE:
			seleniumDriver = new ManageIEDriver();
			break;
		default:
			break;
		}
		return seleniumDriver;
	}
	

}
