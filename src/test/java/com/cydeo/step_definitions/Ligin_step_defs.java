package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ligin_step_defs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("seamless.url"));

    }
    @When("the user enter valid username")
    public void the_user_enter_valid_username() {

    }
    @When("the user enter valid passwors")
    public void the_user_enter_valid_passwors() {

    }
    @When("the user clicks to log in button")
    public void the_user_clicks_to_log_in_button() {

    }
    @Then("the user should be able to log in")
    public void the_user_should_be_able_to_log_in() {

    }



}
