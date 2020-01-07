Feature: Find Transactions in Account Activity
 @f
 Scenario: Verify that Account Summary is dsiplayed
    Given user is on the login page
    Then user enters valid credentials
    And user verifies that "Account Summary" is displayed
   Then user navigate to "Account Activity" submodule
   Given the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
   And the results should be sorted by most recent date
   When the user enters date range from "2012-09-02" to "2012-09-06"
   And the results table should only not contain transactions dated "2012-09-01"

@ff
  Scenario: Verify that Account Summary is dsiplayed
    Given user is on the login page
    Then user enters valid credentials
    And user verifies that "Account Summary" is displayed
    Then user navigate to "Account Activity" submodule
    Given the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And the results table should only not contain transactions dated "2012-09-01"