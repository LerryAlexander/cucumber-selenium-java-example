@release @signin
Feature: Sign In
  # ===================================================
  # This feature for running tests for Sign In validation on Gruyure Web App
  # ====================================================

  @smoke
  Scenario Outline: Successful Sign In on Gruyure Web App
    Given I am on the Gruyure Home web page
    When I click on "<clickOption>"
    And I fill up "<username>" and "<password>" with an existing account
    When I click on Home
    Then I am logged in successfully

    Examples:
      | username  | password | clickOption  |
      | lerry     | 123456   | Sign In      |
      | claudia   | 654321   | Sign In      |