Feature: Login page functionality

  @positive
  Scenario Outline: Login with  valid email and password credentials
    Given Login page is opened
    When email "<valid email>" is entered
    And password "<valid password>" is entered
    And Login button is clicked
    Then main page is opened

    Examples:
      | valid email        | valid password |
      | qfn16733@omeie.com | AAwser4567!  |


    @negative
#      @wip
  Scenario Outline: Correct error message is when signing in with invalid credentials
    Given Login page is opened
    When login credentials ("<email>" and "<password>") are entered
    And Login button is clicked
    Then error message appears

    Examples:
      | email              | password   |
      | qfn16733@omeie.com | 4567AAwser!|
#      | abc-@mail.com      | 3456Zsxdf! |
#      | abc.def@mail.c      | 3456Zsxdf! |





