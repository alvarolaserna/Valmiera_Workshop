Feature: Shopping list

  Background: open application
    Given I open the application


    Scenario: Add shopping list
      When I click on add shopping list
      And I type "First List"
      And I click on add list
      Then I see new list "First List" on landing screen

  Scenario: Add shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see new list "First List" on landing screen
    When I open the shopping list "First List"
    When I remove the list "First List"
    Then I check there is no "First List"
