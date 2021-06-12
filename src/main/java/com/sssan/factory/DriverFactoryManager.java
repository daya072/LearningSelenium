package com.sssan.factory;

import com.sssan.driver.ManageChromeDriver;
import com.sssan.driver.ManageIEDriver;
import com.sssan.enums.BrowserType;
import com.sssan.interfaces.ISeleniumDriver;

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
