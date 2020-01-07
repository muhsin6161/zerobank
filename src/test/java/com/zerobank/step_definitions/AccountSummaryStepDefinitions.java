package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utulities.BrowserUtils;
import com.zerobank.utulities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {
    LoginPage loginPage=new LoginPage();
    @Then("user verifies that pagetitle is {string}")
    public void user_verifies_that_pagetitle_is(String string) {
        Assert.assertEquals(string,Driver.get().getTitle());
    }
    @Then("user verifies that modules are displayed")
    public void user_verifies_that_modules_are_displayed(List<String> dataTable) {
      Assert.assertEquals(dataTable, BrowserUtils.getListOfString(loginPage.main_modules));
    }

    @Then("user able to see in credit acoount these columns")
    public void user_able_to_see_in_credit_acoount_these_columns(List<String> dataTable) {
Assert.assertEquals(dataTable.get(0),loginPage.Account.getText());
        Assert.assertEquals(dataTable.get(1),loginPage.CreditCard.getText());
        Assert.assertEquals(dataTable.get(2),loginPage.Balance.getText());
    }






}
