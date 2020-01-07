Feature: Login
  User able to login


  Scenario: Verify that Account Summary is dsiplayed
    Given user is on the login page
    Then user enters valid credentials
    And user verifies that "Account Summary" is displayed
@N
    Scenario: Verify that error message is displayed
      Given user is on the login page
      Then user enters invalid credentials
      And user verify that "Login and/or password are wrong." is displayed

