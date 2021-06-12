package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sssan.base.BasePage;
import com.sssan.driver.DriverInit;

public class DriverRunPage extends BasePage {

	@FindBy(name = "q")
	WebElement searchTextBox;

	@FindBy(id = "alerttest")
	WebElement alertTestLink;

	@FindBy(id = "alertexamples")
	WebElement alertExamplesBox;

	protected String abc;
	DriverInit driverInit;

	public DriverRunPage(DriverInit driverInit) {
		super(driverInit);
		this.driverInit = driverInit;
	}

	public void launchUrl() {
		driverInit.getDriver().get("https://www.google.com");
	}

	public void searchText(String searchParam) {
		searchTextBox.sendKeys(searchParam);
	}

	public void launchHerokuAppUrl() {
		driverInit.getDriver().get("https://testpages.herokuapp.com/styled/index.html");
	}

	public void clickAlertLink() {
		alertTestLink.click();
	}
	
	public void validateAlertTextBox() {
		alertExamplesBox.isDisplayed();
	}

}
