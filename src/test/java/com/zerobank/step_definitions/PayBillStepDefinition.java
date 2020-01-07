package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Then;

import java.util.Map;

public class PayBillStepDefinition {
LoginPage loginPage=new LoginPage();
    @Then("Enter information about transaction")
    public void enter_information_about_transaction(Map<String,String> dataTable) {
loginPage.Pay(dataTable.get("Payee"),dataTable.get("Account"),dataTable.get("Amount"),dataTable.get("Date"),dataTable.get("Description"));



    }

}
