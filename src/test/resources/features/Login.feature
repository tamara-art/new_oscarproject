Feature: Login page functionality

  @positive
  Scenario Outline: Login with  valid email and password credentials
    Given Login page is opened
    When login credentials ("<valid email>" and "<valid password>") are entered
    And Login button is clicked
    Then main page is opened

    Examples:
      | valid email        | valid password |
      | qfn16733@omeie.com | AAwser4567!  |


    @negative
#      @wip
  Scenario Outline: Correct error message appears when signing in with invalid credentials
    Given Login page is opened
    When login credentials ("<email>" and "<password>") are entered
    And Login button is clicked
    Then error message appears

    Examples:
      | email              | password   |
      | qfn16733@omeie.com | 4567AAwser!|






