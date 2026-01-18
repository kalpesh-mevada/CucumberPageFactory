@mustRun
Feature: Features to demo

  @important
  Scenario: Sample 1
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in
    
    
   @regression
   Scenario: Sample 2
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in
    
    @smoke @regression
   Scenario: Sample 3
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in
    
  	@smoke 
   Scenario: Sample 4
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in