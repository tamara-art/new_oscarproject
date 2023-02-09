Feature: Registration functionality


  @positive
    @requiresUserDeletion
  Scenario Outline: Registration with valid credentials
    Given Registration page is opened
    When Registration credentials "<validEmail>" and "<validPassword>" for registration are entered
    And Register button is clicked
    Then Item list container is present
    And Username is visible

    Examples:
      | validEmail                   | validPassword|
      | txjbuenpogdtzaizhx@tmmwj.net | Zsxdcf567!  |