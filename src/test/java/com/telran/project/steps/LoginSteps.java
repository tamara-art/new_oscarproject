package com.telran.project.steps;

import com.telran.project.fw.ApplicationManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    protected static ApplicationManager app;

    public LoginSteps(ApplicationManager app) {
        LoginSteps.app = app;
    }

//    @After
//    public void afterScenario(){
//        app.stopApp();
//        System.out.println("After is called!");
//    }

    @Given("Login page is opened")
    public void loginPageIsOpened() {
        app.goToRegistrationAndLoginPage();
    }

    @When("login credentials \\({string} and {string}) are entered")
    public void loginCredentialsAreEntered(String email, String pwd) {
        app.getLoginPageHelper().enterEmail(email);
        app.getLoginPageHelper().enterPassword(pwd);
    }

    @And("Login button is clicked")
    public void loginButtonIsClicked() {
        app.getLoginPageHelper().clickLoginBtn();
    }

    @Then("main page is opened")
    public void mainPageIsOpened() {
        app.goToMainPage();
    }


    @Then("error message appears")
    public void errorMessageAppears() {
        Assert.assertTrue("Error message appears", app.getLoginPageHelper().hasErrorMsg());
    }

    @When("default login credentials are entered")
    public void defaultLoginCredentialsAreEntered() {
        loginCredentialsAreEntered(app.getUserContext().getEmail(), app.getUserContext().getPwd());
    }
}
