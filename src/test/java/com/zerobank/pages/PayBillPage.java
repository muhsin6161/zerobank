package com.zerobank.pages;

import com.zerobank.utulities.BrowserUtils;
import com.zerobank.utulities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillPage extends FindTransactionSubmodule {
@FindBy(css = "[id=\"np_new_payee_name\"]")
    public WebElement PayeeName;

@FindBy(css = "[id=\"np_new_payee_address\"]")
public WebElement PayeeAddress;
@FindBy(css = "[id=\"np_new_payee_account\"]")
public WebElement PayeeAccount;
@FindBy(css = "[id=\"np_new_payee_details\"]")
public WebElement PayeeDetails;





    @FindBy(css = "[id=\"sp_amount\"]")
    public WebElement Amount;

    @FindBy(css = "[name=\"account\"]")
    public WebElement Account;

    @FindBy(css = "[name=\"payee\"]")
    public WebElement Payee;
@FindBy(css = "[name=\"date\"]")
public WebElement date;
@FindBy(css = "[name=\"description\"]")
public WebElement description;

    public PayBillPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }
public void Pay(String Payee,String Account,String amount,String date,String Description){

        this.Payee.sendKeys(Payee);
        this.Account.sendKeys(Account);
        Amount.sendKeys(amount);
        this.date.sendKeys(date);
        description.sendKeys(Description, Keys.ENTER);
}

public void CreateNew(String Name,String Address,String Account,String details){
       PayeeName.sendKeys(Name);
        PayeeAddress.sendKeys(Address);
        PayeeAccount.sendKeys(Account);

        PayeeDetails.sendKeys(details,Keys.ENTER);

    }

}
