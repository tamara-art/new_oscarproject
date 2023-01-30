Feature: Login page functionality


    @negative
#      @currently-working
#      @wip
  Scenario Outline: Correct error message is when signing in with invalid credentials
    Given Login page is opened
    When login credentials ("<email>" and "<password>") are entered
    And Login button is clicked
    Then error message appears

    Examples:
      | email         | password |
      | oiy58283@xcoxc.com | Awser3567!! |
      | oiy58283@xcoxc.com | 3567Awser!! |





