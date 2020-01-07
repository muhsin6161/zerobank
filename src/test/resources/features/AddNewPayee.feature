Feature: Add new payee under pay bills

  @scenariooutlet
  Scenario Outline: Add a new payee
    Given user is on the login page
    Then user enters valid credentials
    And user verifies that pagetitle is "Zero - Account Summary"
    Then user navigate to "Pay Bills" submodule
    And user should click Add New Payee submodule
    Then user create new Payee  "<Payee Name>","<Payee Address>","<Account>","<Payee Details>"




    Examples:
      | Payee Name |Payee Address|Account|Payee Details|
      | The Law Offices of Hyde, Price & Scharks |The Law Offices of Hyde, Price & Scharks|Checking|XYZ account|