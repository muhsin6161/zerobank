package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user_login") //this line will initialize web element
    public WebElement userNameInput;

    @FindBy(id = "user_password")//without findby, web element will be null
    public WebElement passwordInput;
@FindBy(css = "[class=\"alert alert-error\"]")
    public WebElement message;
    public LoginPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }

    public void login(String userName, String password) {
        userNameInput.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordInput.sendKeys(password, Keys.ENTER);
    }
}