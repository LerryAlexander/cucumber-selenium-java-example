@release @signOut
Feature: Sign Out
  # ===================================================
  # This feature for running tests to validate Sign Out action on Gruyure Web App
  # ====================================================

  @smoke
  Scenario Outline: Successful Sign Out on Gruyure Web App
    Given I am logged in on Gruyure Web App with "<username>" and "<password>"
    When I click on "<clickOption>"
    Then I am logged out successfully

    Examples:
      | username  | password | clickOption  |
      | lerry     | 123456   | Sign Out     |
      | claudia   | 654321   | Sign Out     |