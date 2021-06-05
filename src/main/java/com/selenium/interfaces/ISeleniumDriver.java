package com.selenium.interfaces;

import org.openqa.selenium.WebDriver;

public interface ISeleniumDriver {
	
	public void setCapabilities();
	public void setUpDriver();
	public void quitDriver();
	public WebDriver setLocalDriver();
	public void setGridDriver(); 

}
