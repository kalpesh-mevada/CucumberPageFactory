Feature: Check home page functionality 

Background: user is on logged in
Given user is on login page
When user enter uname and pswd
And user click on login link
Then user should redirect to home page
	
Scenario: Check logout link
#Given user is logged in
When user click on Welcome link
Then logout link is displayed

Scenario: Verify Quick launch toolbar is present
#Given user is logged in
When user clicks on dashboard link
Then Quick launch toolbar is displayed