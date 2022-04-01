@login
Feature: To check the login functionality

  Background: 
    Given user has to be in the login page

  @smoke @sanity
  Scenario Outline: To check the login functionality with invalid credentials
    Given user has to be in the login page
    When user has to enter the "<username>" and enter the "<password>"
    And user has to click the login button
    Then user can't navigate to the home page

    Examples: 
      | username     | password   |
      | Murugan12592 | Pass@word  |
      | Log12592     | Wod@123    |
      | Java@123     | Pass@wo123 |

  @sanity
  Scenario: To check the login functionality without passing the credentials
    When user has to click the login button
    Then user can't navigate to the home page
