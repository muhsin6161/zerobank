package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage extends PayBillPage{

    @FindBy(css = "[id=\"account_summary_tab\"]")
    public WebElement Account_Summary;
@FindBy(css = "[class=\"board-header\"]")
public List<WebElement> main_modules;
@FindBy(xpath = "//th[text()='Credit Card']")
public WebElement CreditCard;
@FindBy(xpath = "//th[text()='Credit Card']/following-sibling::th")
public WebElement Balance;
@FindBy(xpath = "//th[text()='Credit Card']/preceding-sibling::th")
public WebElement Account;
@FindBy(xpath ="//option[1]" )
public WebElement defaultt;
@FindBy(xpath = "//option")
public List<WebElement> option;
@FindBy(xpath = "//thead/tr/th")
public  List<WebElement> Transactions_column;

public BasePage(){

    PageFactory.initElements(Driver.get(), this);
}

public void navigateTo(String module){
    String modulLocator="//*[text()='"+module+"']";
WebElement Module=Driver.get().findElement(By.xpath(modulLocator));
Module.click();
}




}
