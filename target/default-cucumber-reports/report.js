$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddNewPayee.feature");
formatter.feature({
  "name": "Add new payee under pay bills",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add a new payee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenariooutlet"
    }
  ]
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters valid credentials",
  "keyword": "Then "
});
formatter.step({
  "name": "user verifies that pagetitle is \"Zero - Account Summary\"",
  "keyword": "And "
});
formatter.step({
  "name": "user navigate to \"Pay Bills\" submodule",
  "keyword": "Then "
});
formatter.step({
  "name": "user should click Add New Payee submodule",
  "keyword": "And "
});
formatter.step({
  "name": "user create new Payee  \"\u003cPayee Name\u003e\",\"\u003cPayee Address\u003e\",\"\u003cAccount\u003e\",\"\u003cPayee Details\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Payee Name",
        "Payee Address",
        "Account",
        "Payee Details"
      ]
    },
    {
      "cells": [
        "The Law Offices of Hyde, Price \u0026 Scharks",
        "The Law Offices of Hyde, Price \u0026 Scharks",
        "Checking",
        "XYZ account"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add a new payee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenariooutlet"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that pagetitle is \"Zero - Account Summary\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.user_verifies_that_pagetitle_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to \"Pay Bills\" submodule",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivity.user_navigate_to_submodule(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click Add New Payee submodule",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewPayesStepDefinition.user_should_click_Add_New_Payee_submodule()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user create new Payee  \"The Law Offices of Hyde, Price \u0026 Scharks\",\"The Law Offices of Hyde, Price \u0026 Scharks\",\"Checking\",\"XYZ account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewPayesStepDefinition.user_create_new_Payee(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});