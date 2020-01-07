package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utulities.ConfigurationReader;
import com.zerobank.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
String url= ConfigurationReader.getProperty("url");
        Driver.get().get(url);
    }

    @Then("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.login("username","password");
    }

    @Then("user verifies that {string} is displayed")
    public void user_verifies_that_is_displayed(String string) {
        Assert.assertTrue(loginPage.Account_Summary.isDisplayed());
        System.out.println("passed");
    }
    @Then("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        loginPage.login("mmm","nnnn");
    }

    @Then("user verify that {string} is displayed")
    public void user_verify_that_is_displayed(String string) {
        Assert.assertTrue(loginPage.message.isDisplayed());
        System.out.println("passed");
    }


}
