package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utulities.BrowserUtils;
import com.zerobank.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FindTransactionsdefinition {
LoginPage loginPage=new LoginPage();
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
     loginPage.findtransaction.click();


    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {
        loginPage.find(string,string2);
        loginPage.submit.click();
        BrowserUtils.wait(10);
    }


    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
     loginPage.sort();

    }
    @When("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        Assert.assertFalse(     loginPage.transaction_num.toArray().toString().contains(string));
    }







}
