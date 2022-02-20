package com.zerobank.stepdefinitions;

import com.zerobank.page.AccountActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindTransactionsDef {

    AccountActivityPage accountActivityPage=new AccountActivityPage();


    @When("the user navigate to {string} tab")
    public void the_user_navigate_to_tab(String tab) {
        accountActivityPage.navigateTo(tab);
    }

    @Given("the user accesses the {string} tab")
    public void the_user_accesses_the_tab(String tab) {
        accountActivityPage.navigateTo(tab);
    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {
       accountActivityPage.fromDate.clear();
        accountActivityPage.fromDate.sendKeys(fromDate);
        accountActivityPage.toDate.clear();
        accountActivityPage.toDate.sendKeys(toDate);

    }
    @When("clicks search")
    public void clicks_search() {
       accountActivityPage.findButton.click();
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
