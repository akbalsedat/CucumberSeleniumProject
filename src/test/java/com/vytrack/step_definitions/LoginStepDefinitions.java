package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("I am on the login page.");

    }

<<<<<<< HEAD
    @Then("user logs in as store manager")
    public void user_logs_in_as_store_manager() {
        System.out.println("Login as store manager");
    }
    @Then("User verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("Verifying page subtitle: " + string);
    }

    @Then("user logs in as driver")
    public void user_logs_in_as_driver() {
        System.out.println("User logs in as driver");
    }

    @Then("user logs in as sale manager")
    public void user_logs_in_as_sale_manager() {
        System.out.println("User logs in as sale manager");
=======
    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("Login as sales manager");
        loginPage.login("salesmanager110", "UserUser123");
    }

    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        System.out.println("Login as store manager");
        loginPage.login("storemanager85", "UserUser123");
    }

    @When("user logs in as a driver")
    public void user_logs_in_as_a_driver() {
        System.out.println("Login as a driver");
        loginPage.login("user19", "UserUser123");
    }

    @Then("user should verify that title is a Dashboard")
    public void user_should_verify_that_title_is_a_Dashboard() {
        System.out.println("Verify that title is a Dashboard");
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
    }

    @When("User enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.printf("Login with username %s and %s password\n", string, string2);
        loginPage.login(string, string2);
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
>>>>>>> New Calendar Future File
    }
}
