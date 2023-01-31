package com.telran.project.steps;

import com.telran.project.fw.ApplicationManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
    protected static ApplicationManager app;

    public RegistrationSteps(ApplicationManager app) {
        RegistrationSteps.app = app;
    }

    @Given("Registration page is opened")
    public void registrationPageIsOpened() {
        app.goToRegistrationAndLoginPage();
    }

    @When("Registration credentials \\({string} and {string}) for registration are entered")
    public void registrationCredentialsAndForRegistrationAreEntered(String email, String password) {
        app.getRegistrationHelper().enterEmail(email);
        app.getRegistrationHelper().enterPassword(password);
    }


    @And("Register button is clicked")
    public void registerButtonIsClicked() {
        app.getRegistrationHelper();
    }

    @Then("User is registered")
    public void userIsRegistered() {
        app.getRegistrationHelper();
    }

    @And("User is logged in")
    public void userIsLoggedIn() {
        app.getRegistrationHelper();
    }
}
