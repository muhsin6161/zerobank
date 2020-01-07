Feature: Faetures in Account Activity module
  As user able to use submodules in Account Avtivity module

  Scenario: Verify that Account Summary is dsiplayed
    Given user is on the login page
    Then user enters valid credentials
    And user verifies that pagetitle is "Zero - Account Summary"
@mm
    Scenario: Verify that Account submodule have options
      Given user is on the login page
      Then user enters valid credentials
      Then user navigate to "Account Activity" submodule
      And Verify  that "Savings" is default option
      Then user able to have otions in drop down menu
      |Savings|
      |Checking|
      |Savings |
      |Loan   |
      |Credit Card|
      |Brokerage  |
      And user able to see these column names
      |Date       |
      |Description|
      |Deposit    |
      |Withdrawal |


