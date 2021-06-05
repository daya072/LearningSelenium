package com.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.selenium.interfaces.ISeleniumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageChromeDriver implements ISeleniumDriver{

	WebDriver driver;
	private ChromeOptions options;
	@Override
	public void setCapabilities() {
		options = new ChromeOptions();
		options.setCapability("", "");
	}

	@Override
	public void setUpDriver() {
		WebDriverManager.chromedriver().setup();
		
	}

	@Override
	public void quitDriver() {
		driver.quit();
	}

	@Override
	public WebDriver setLocalDriver() {
		setUpDriver();
		setCapabilities();
		driver = new ChromeDriver(options);
		return driver;
	}

	@Override
	public void setGridDriver() {
		// TODO Auto-generated method stub
		
	}

}
