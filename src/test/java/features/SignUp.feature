@release @signup
Feature: Sign Up
  # ===================================================
  # This feature for running tests over Sign Up validation on Gruyure Web App
  # ====================================================

  @smoke
  Scenario Outline: Successful Sign Up on Gruyure Web App
    Given I am on the Gruyure Home web page
    When I click on "<clickOption>"
    And I fill up with a "<username>" and "<password>"
    And I click on Create account
    When I click on Home
    Then I am logged in successfully

    Examples:
      | username  | password | clickOption  |
      | gabriel   | 123456   | Sign Up      |
      | alejandro | 654321   | Sign Up      |