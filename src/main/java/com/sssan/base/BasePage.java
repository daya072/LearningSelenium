package com.sssan.base;

import org.openqa.selenium.support.PageFactory;

import com.sssan.driver.DriverInit;

public class BasePage {

	public BasePage(DriverInit driverInit) {

		PageFactory.initElements(driverInit.getDriver(), this);
	}

}
