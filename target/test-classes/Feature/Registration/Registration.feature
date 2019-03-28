Feature: A user can register to create a new account

Background: 

	Given launching app


@REGISTRATION
Scenario Outline: Successful Registration

	Given user fills out the registration form
	And clicks register
	Then user should be logged in after submitting the registration form "<Testname>" 
	
	Examples:
	
	|Testname |
	|Success  |
	
