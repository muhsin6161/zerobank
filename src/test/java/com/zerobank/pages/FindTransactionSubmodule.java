package com.zerobank.pages;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.zerobank.utulities.BrowserUtils;
import com.zerobank.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class FindTransactionSubmodule {
@FindBy(xpath = "//a[text()='Find Transactions']")
    public WebElement findtransaction;
  @FindBy(xpath = "//*[@id=\"aa_fromDate\"]")
    public WebElement Date1;
@FindBy(css = "[id=\"aa_toDate\"]")
    public WebElement Date2;
@FindBy(css = "[type=\"submit\"]")
public WebElement submit;
@FindBy(xpath ="//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr" )
public List<WebElement> transaction_num;

public FindTransactionSubmodule(){
    PageFactory.initElements(Driver.get(),this);
}

public void find(String date1,String date2){
    Date1.sendKeys(date1);
    Date2.sendKeys(date2);

}
public void sort(){

    Set<String> list=new LinkedHashSet<>();
    for(int i=1;i<=transaction_num.size();i++){
WebElement element=Driver.get().findElement(By.xpath("//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr["+i+"]/td[1]"));
    list.add(element.getText());
    }
    System.out.println(list);

}

}
