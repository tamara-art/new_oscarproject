Feature: Account feature

@requiresUserDeletion
@positive
Scenario Outline: Account contains correct profile data
  Given Login page is opened
  When login credentials ("<valid email>" and "<valid password>") are entered
  And Login button is clicked
  Then main page is opened
  Given Account page is opened
  When Delete profile button is clicked
  And Delete profile page is opened
  Then Enter confirmation password
  Then Warning message appears
  Then Button danger is clicked
  And Profile is deleted
  And Allerinner message appears

  Examples:
    | valid email        | valid password |
    | qfn16733@omeie.com | AAwser4567!  |

