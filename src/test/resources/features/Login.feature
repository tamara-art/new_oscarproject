Feature: Login page functionality


    @negative
      @currently-working
#      @wip
  Scenario Outline: Correct error message is when signing in with invalid credentials
    Given Login page is opened
    When login credentials ("<email>" and "<password>") are entered
    And Login button is clicked
    Then error message appears

    Examples:
      | email         | password |
      | dhn51171@xcoxc.com| Asdft678! |
#      | dhn51171@xcoxc.com| 678Asdft! |
#
  @positive
  Scenario Outline: Login with  valid email and password credentials
    Given Login page is opened
    When email "<valid email>" is entered
    And password "<valid password>" is entered
    And Login button is clicked
    Then error message appears

    Examples:
      | valid email                                    | valid password |
      | very.common@example.com                        | very.common      |
#      | disposable.style.email.with+symbol@example.com | disposable.style |
#      | other.email-with-dash@example.com              | other.email      |

#
#  @negative
#  Scenario Outline: Login with invalid email and password credentials
#    Given Login page is opened
#    When email "<invalid Email>" is entered
#    And password "<invalid Password>" is entered
#    And Login button is clicked
#    Then error message appears
#
#    Examples:
#      | invalid Email              | invalid Password |
#      | just"not"right@example.com | just"not"right   |
##      | john..doe@example.com      | john..doe        |
##      | example@localhost          | example          |
#
#  @wip
#  @positive
#



