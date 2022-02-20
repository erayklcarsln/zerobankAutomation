package com.zerobank.stepdefinitions;

import com.zerobank.page.AccountActivityPage;
import com.zerobank.page.AccountSummaryPage;
import com.zerobank.page.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountActivityDef {

    LoginPage loginPage=new LoginPage();
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.singinButton.click();
        BrowserUtils.waitFor(2);
        loginPage.login();
        Driver.get().navigate().to("http://zero.webappsecurity.com/bank/account-summary.html");
    }

    @When("the	user	clicks	on	{string}	link	on	the	Account	Summary	page")
    public void theUserClicksOnLinkOnTheAccountSummaryPage(String tab) {
        accountSummaryPage.navigateTo(tab);
    }


    @Then("the	{string} page	should	be	displayed")
    public void thePageShouldBeDisplayed(String tab) {
        Assert.assertTrue(Driver.get().findElement(By.partialLinkText(tab)).isDisplayed());
    }

    @And("Account	drop	down	should	have	{string}	selected")
    public void accountDropDownShouldHaveSelected(String selected) {
        String actualSelected=accountActivityPage.dropDown();
        System.out.println("selected = " + selected);
        System.out.println("actualSelected = " + actualSelected);
        Assert.assertEquals("verify selected",selected,actualSelected);
    }
}
