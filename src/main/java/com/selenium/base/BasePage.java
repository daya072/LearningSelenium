package com.selenium.base;

import org.openqa.selenium.support.PageFactory;

import com.selenium.driver.DriverInit;

public class BasePage {

	public BasePage(DriverInit driverInit) {

		PageFactory.initElements(driverInit.getDriver(), this);
	}

}
