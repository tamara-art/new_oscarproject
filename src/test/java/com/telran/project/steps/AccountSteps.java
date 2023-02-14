package com.telran.project.steps;

import com.telran.project.fw.ApplicationManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSteps {
    protected static ApplicationManager app;

    public AccountSteps(ApplicationManager app) {
        AccountSteps.app = app;
    }


    @Given("Account page is opened")
    public void accountPageIsOpened() {
        app.goToProfilePage();

    }

    @When("Delete profile button is clicked")
    public void deleteProfileButtonIsClicked() {
        app.getAccountHelper().clickDeleteBtn();

    }

    @And("Delete profile page is opened")
    public void deleteProfilePageIsOpened() {
        app.goToDeleteProfilePage();
    }

    @Then("Enter confirmation password")
    public void enterConfirmationPassword(String pwd) {
        app.getAccountHelper().confirmPasswordToDeleteProfile(pwd);
    }

    @Then("Warning message appears")
    public void warningMessageAppears() {
        Assert.assertTrue("Warning message appears", app.getAccountHelper().hasWarningMsg());
    }

    @Then("Button danger is clicked")
    public void buttonDangerIsClicked() {
        app.getAccountHelper().clickDangerBtn();
    }

    @And("Profile is deleted")
    public void profileIsDeleted () {
        app.goToAllProductsPage();
    }

    @And("Allerinner message appears")
    public void allerinnerMessageAppears() {
        Assert.assertTrue("Allertinner message appears",
                app.getAccountHelper().hasAllerInnerMsg());
    }
}

