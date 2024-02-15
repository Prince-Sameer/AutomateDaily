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
@tag
Feature: Login
  I want to use this template for my feature file
  
  Background: 
   Given I set up env

  @tag1
  Scenario: I am able to Login successfullly
    Given I visit the url on chrome browser
    When I enter email is in email field
    And II close the browser enter password in password feld
    And I click on the login button
    Then I am able to see the homepage
    And 

  
