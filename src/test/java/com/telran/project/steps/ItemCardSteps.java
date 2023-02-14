package com.telran.project.steps;

import com.telran.project.fw.ApplicationManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemCardSteps {
    protected static ApplicationManager app;

    public ItemCardSteps(ApplicationManager app) {
        LoginSteps.app = app;
    }

    @When("All products page is opened")
    public void allProductsPageIsOpened() {
        app.goToAllProductsPage();
    }

    @Given("Url ist correct")
    public void urlIstCorrect() {
        app.goToAllProductsPage();
    }

    @When("Correct book title in navigation panel")
    public void correctBookTitleInNavigationPanel() {

    }

    @When("Book title is the same as on all products page")
    public void bookTitleIsTheSameAsOnAllProductsPage() {

    }

    @When("Prise is the same as on All products page")
    public void priseIsTheSameAsOnAllProductsPage() {

    }

    @When("The product has in stock label")
    public void theProductHasInStockLabel() {

    }

    @And("Add to basket is clickable")
    public void addToBasketIsClickable() {
    }
}
