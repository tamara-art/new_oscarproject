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
      | validEmail         | validPassword|
      | qfn16733@omeie.com | AAwser4567!  |


  @negative
  Scenario Outline: Correct error message appears when registration with invalid credentials
    Given Registration page is opened
    When Registration credentials "<validEmail>" and "<invalidPassword>" for registration are entered
    And Register button is clicked
    Then Item list container is present
    And correct error message appears

    Examples:
      | validEmail         | invalidPassword|
      | qfn16733@omeie.com | AAwser456!     |

  @negative
  Scenario Outline: Correct error message appears when registration is with invalid credentials
    Given Registration page is opened
    When Registration credentials "<invalidEmail>" and "<validPassword>" for registration are entered
    And Register button is clicked
    Then Item list container is present
    And correct error message appears

    Examples:
      | invalidEmail      | validPassword|
      | qfn16733@meie.com | AAwser4567!  |
