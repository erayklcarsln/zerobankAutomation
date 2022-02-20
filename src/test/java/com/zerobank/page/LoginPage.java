package com.zerobank.page;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement singinButton;

    @FindBy(id = "user_login")
    public WebElement userInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement submit;

    public void login() {
        String username= ConfigurationReader.get("username");
        String password= ConfigurationReader.get("password");
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
    }



}
