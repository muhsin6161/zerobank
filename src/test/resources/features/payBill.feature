Feature: To Complete transaction
@p
  Scenario: Verify that Account Summary is dsiplayed
    Given user is on the login page
    Then user enters valid credentials
    And user verifies that pagetitle is "Zero - Account Summary"
    Then user navigate to "Pay Bills" submodule
Then Enter information about transaction
    |Payee|Apple|
    |Account|Checking|
    |Amount|50       |
    |Date  |2019-12-12|
    |Description|for rent|
