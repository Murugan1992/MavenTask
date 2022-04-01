@DataTable
Feature: To check the login functionality

  Background: 
    Given user has to be in the login page

  @smoke @sanity #1D
  Scenario: To check the login functionality with invalid credentials
    Given user has to be in the login page
    When user has to enter the username and enter the password
    |Murugan12592|Pass@word|
    And user has to click the login button
    Then user can't navigate to the home page


  @sanity
  Scenario: To check the login functionality without passing the credentials
    When user has to click the login button
    Then user can't navigate to the home page
