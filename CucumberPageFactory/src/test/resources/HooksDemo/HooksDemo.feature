Feature: Check Login Functionality

@smoke
Scenario:
Given user is on the login page of hooks
When end user enters username and password
And clicks on login button
Then user is navigated to the home

#Added same scenarios to check hooks executed after each scenarios to verify open and close browser
Scenario:
Given user is on the login page of hooks
When end user enters username and password
And clicks on login button
Then user is navigated to the home