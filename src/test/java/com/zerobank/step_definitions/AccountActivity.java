package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utulities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivity {
LoginPage loginPage=new LoginPage();
    @Then("user navigate to {string} submodule")
    public void user_navigate_to_submodule(String string) {
loginPage.navigateTo(string);
    }

    @Then("Verify  that {string} is default option")
    public void verify_that_is_default_option(String string) {
        Assert.assertEquals(string,loginPage.defaultt.getText());
    }

    @Then("user able to have otions in drop down menu")
    public void user_able_to_have_otions_in_drop_down_menu(List<String> dataTable) {
loginPage.defaultt.click();
   Assert.assertEquals(dataTable, BrowserUtils.getListOfString(loginPage.option));
    }

    @Then("user able to see these column names")
    public void user_able_to_see_these_column_names(List<String> dataTable) {

Assert.assertEquals(dataTable,BrowserUtils.getListOfString(loginPage.Transactions_column));
    }

}
