Feature: Test Run

Scenario Outline: Test launch of driver
	Given I launch the url
	Then I search for the text "<searchText>"

	Examples:
	|searchText|
	|selenium|
	|java|
	|cucumber|
	
Scenario: Test launch of heroku app
	Given I launch the herokuapp url
	And I click on Alerts java script link
	Then I am navigated to alerts box example page