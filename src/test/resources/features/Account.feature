Feature: Account feature

@requiresUserRegistration
@positive
Scenario: Account contains correct profile data
  Given Login page is opened
  When default login credentials are entered
  And Login button is clicked
  Then main page is opened
  Given Account page is opened
  When Delete profile button is clicked
  And Delete profile page is opened
  Then Enter confirmation password
  Then Warning message appears
  Then Button danger is clicked
  And Profile is deleted
  And 'Your profile has now been deleted. Thanks for using the site' message appears

