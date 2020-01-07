Feature: Account summary page verifications


@a
  Scenario: Verify that Account Summary is dsiplayed
Given user is on the login page
Then user enters valid credentials
And user verifies that pagetitle is "Zero - Account Summary"

@m
  Scenario: Verify that main modules are dsiplayed
    Given user is on the login page
    Then user enters valid credentials
  And  user verifies that modules are displayed
    |Cash Accounts      |
    |Investment Accounts|
    |Credit Accounts    |
    |Loan Accounts      |

    And user able to see in credit acoount these columns
    |Account    |
    |Credit Card|
    |Balance    |


