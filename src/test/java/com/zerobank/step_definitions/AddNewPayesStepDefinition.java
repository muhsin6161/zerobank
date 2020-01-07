package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utulities.BrowserUtils;
import com.zerobank.utulities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddNewPayesStepDefinition {
    LoginPage loginPage=new LoginPage();
    @Then("user should click Add New Payee submodule")
    public void user_should_click_Add_New_Payee_submodule() {
      Driver.get().findElement(By.cssSelector("[href=\"#ui-tabs-2\"]")).click();
        BrowserUtils.wait(5);
    }


    @Then("user create new Payee  {string},{string},{string},{string}")
    public void user_create_new_Payee(String string, String string2, String string3, String string4) {

        loginPage.CreateNew("The Law Offices of Hyde, Price & Scharks","The Law Offices of Hyde, Price & Scharks","Checking","xyz");
        WebElement text=Driver.get().findElement(By.cssSelector("[id=\"alert_content\"]"));
        Assert.assertTrue(text.isDisplayed());
        System.out.println("passed");
    }


}
