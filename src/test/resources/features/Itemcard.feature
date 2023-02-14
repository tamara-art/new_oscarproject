Feature: Item page functionality

  @positive
  Scenario: Landed on item page
    Given Url ist correct
    When Correct book title in navigation panel
    When Book title is the same as on all products page
    When Prise is the same as on All products page
    When The product has in stock label
    And Add to basket is clickable
    Then All products page is opened