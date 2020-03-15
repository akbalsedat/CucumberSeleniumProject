package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("I am on the login page.");

    }

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
    }
}
