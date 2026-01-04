#Author : Kalpesh Mevada
#Date : 07-12-2055
#Description : Learning Cucumber BDD Framework
#@SmokeScenario
Feature: OrangeHRM Login Test 
#@smokeTest
Scenario Outline: Login with credentials
    Given User opens Chrome browser for parameterization
    And User navigates to OrangeHRM login
    When User enters <username> and <password>
    And User clicks on log-in button
    Then User should be logged in successfully in orangeCRM

Examples:  #paramterization
| username | password  |
| Admin    | admin123  |
| user1    | password1 |
#| user2    | password2 |