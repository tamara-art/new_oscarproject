package com.telran.project.steps;

import com.telran.project.fw.ApplicationManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationSteps {
    protected static ApplicationManager app;

    public RegistrationSteps(ApplicationManager app) {
        RegistrationSteps.app = app;
    }

    @Given("Registration page is opened")
    public void registrationPageIsOpened() {
        app.goToRegistrationAndLoginPage();
    }

    @When("Registration credentials {string} and {string} for registration are entered")
    public void registrationCredentialsAndForRegistrationAreEntered(String email, String pwd) {
        app.getRegistrationHelper().enterEmail(email);
        app.getRegistrationHelper().enterPassword(pwd);
        app.getRegistrationHelper().confirmPassword(pwd);
    }

    @And("Register button is clicked")
    public void registerButtonIsClicked() {
        app.getRegistrationHelper().clickRegisterBtn();
    }


    @Then("Item list container is present")
    public void itemListContainerIsPresent() {
        Assert.assertTrue("Item list container is present on the page", app.getItemListContainerHelper()
                .isContainerPresent());

    }

    @And("Username is visible")
    public void usernameIsVisible() {
        Assert.assertTrue("Username ist present on the page", app.getItemListContainerHelper()
                .userNameIsPresent());
    }
}
