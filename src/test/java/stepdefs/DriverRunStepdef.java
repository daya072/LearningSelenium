package stepdefs;

import com.selenium.driver.DriverInit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DriverRunPage;

public class DriverRunStepdef extends DriverRunPage{
	
	public DriverRunStepdef(DriverInit driverInit) {
		super(driverInit);
	}

	@Given("I launch the url")
	public void i_launch_the_url() {
		launchUrl();
	}
	
	@Then("I search for the text {string}")
	public void i_search_for_the_text(String searchText) {
		searchText(searchText);
	}
	
	@Given("I launch the herokuapp url")
	public void i_launch_the_herokupp_url() {
		launchHerokuAppUrl();
	}
	
	@And("I click on Alerts java script link")
	public void i_click_on_alerts_java_script_link() {
		clickAlertLink();
	}
	
	@Then("I am navigated to alerts box example page")
	public void i_am_navigated_to_alerts_box_example_page() {
		validateAlertTextBox();
	}

}
