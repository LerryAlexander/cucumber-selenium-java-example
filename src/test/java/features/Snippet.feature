@release @snippet
Feature: Create and delete Snippets
  # ===================================================
  # This feature for running tests to validate snippet both creation and delete on Gruyure Web App
  # ====================================================

  @smoke
  Scenario Outline: Create and delete an Snippet on Gruyure Web App
    Given I am logged in on Gruyure Web App with "<username>" and "<password>"
    When I click on "<clickOption>"
    And I fill up textarea with "<text>"
    When I click on <button>
    Then I see my Snippet has been created successfully
    When I sign out and go back to sign in
    And I click on My Snippets
    And I delete my last snippet by clicking on X
    Then I see my Snippet has been deleted successfully

    Examples:
      | username  | password | clickOption  | text                                    | button |
      | lerry     | 123456   | New Snippet  | creacion de snippet por usuario lerry   | Submit |
      | claudia   | 654321   | New Snippet  | creacion de snippet por usuario claudia | Submit |