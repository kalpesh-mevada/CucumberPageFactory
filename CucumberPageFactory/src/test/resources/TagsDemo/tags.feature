@mustRun
Feature: Features to demo

  @important
  Scenario: Sample 1
    Given customer is on login page
    When customer enters valid credentials
    Then customer should be logged in
    
    
   @regression
   Scenario: Sample 2
    Given customer is on login page
    When customer enters valid credentials
    Then customer should be logged in
    
    @smoke @regression
   Scenario: Sample 3
    Given customer is on login page
    When customer enters valid credentials
    Then customer should be logged in
    
  	@smoke 
   Scenario: Sample 4
    Given customer is on login page
    When customer enters valid credentials
    Then customer should be logged in