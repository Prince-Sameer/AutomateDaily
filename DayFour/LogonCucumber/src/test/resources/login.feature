#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Functionality  



  Scenario Outline: Checking Login Functionality
    Given I visited the url <url> on the browser <browser>
    When I fill the <emailvalue> in the email field
    And  I fill the <passvalue> in password field
    And  I click on Logon button
    Then I verify the <tit> of Homepage
    

    Examples: 
      |url| emailvalue 			|																			passvalue| browser|tit|
      |https://rahulshettyacademy.com/client/|  abcdef@abcd.com| Abc12345		| chrome|Let's Shop |
