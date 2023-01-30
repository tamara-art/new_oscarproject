Feature: Registration functionality


  @positive
  Scenario Outline: Registration with valid credentials
    Given Registration page is opened
    When Registration credentials "<validEmail>" and "<validPassword>" for registration are entered
    And Register button is clicked
    Then User is registered
    And User is logged in

    Examples:
      | validEmail         | validPassword |
      | oiy58283@xcoxc.com | Awser3567!! |
#      | bke34169@xcoxc.com | Zxcf3578!   |