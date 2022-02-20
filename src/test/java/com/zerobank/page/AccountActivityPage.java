package com.zerobank.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends  BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement dropdown;

   @FindBy(id = "aa_description")
   public WebElement descriptionInput;

   @FindBy(id = "aa_fromDate")
   public WebElement fromDate;

   @FindBy(id = "aa_toDate")
   public WebElement toDate;

   @FindBy(xpath = "//input[@name='fromAmount'][1]")
   public WebElement fromAmountInput;

   @FindBy(css = "#aa_toAmount")
   public WebElement toAmountInput;

   @FindBy(id = "aa_type")
   public WebElement typeSelect;

   @FindBy(css = "[class='btn btn-primary']")
   public  WebElement findButton;





    public String dropDown() {

        Select select=new Select(dropdown);
        List<WebElement> options= select.getOptions();
        String selected=select.getFirstSelectedOption().getText();
        return selected;
    }


}
