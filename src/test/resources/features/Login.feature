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
      | unj83258@nezid.com | Zsxdf3456!      |


    @negative
#      @wip
  Scenario Outline: Correct error message is when signing in with invalid credentials
    Given Login page is opened
    When login credentials ("<email>" and "<password>") are entered
    And Login button is clicked
    Then error message appears

    Examples:
      | email              | password   |
      | unj83258@nezid.com | 3456Zsxdf! |
#      | abc-@mail.com      | 3456Zsxdf! |
#      | abc.def@mail.c      | 3456Zsxdf! |





