package com.sssan.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.sssan.interfaces.ISeleniumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageIEDriver implements ISeleniumDriver {

	WebDriver driver;
	private InternetExplorerOptions options;

	@Override
	public void setCapabilities() {
		options = new InternetExplorerOptions();
		options.setCapability("", "");
	}

	@Override
	public void setUpDriver() {
		WebDriverManager.iedriver().setup();

	}

	@Override
	public void quitDriver() {
		driver.quit();
	}

	@Override
	public WebDriver setLocalDriver() {
		setUpDriver();
		setCapabilities();
		driver = new InternetExplorerDriver(options);
		return driver;
	}

	@Override
	public void setGridDriver() {
		// TODO Auto-generated method stub

	}

}
