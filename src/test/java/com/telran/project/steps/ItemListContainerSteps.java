package com.telran.project.steps;

import com.telran.project.fw.ApplicationManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemListContainerSteps {
    protected static ApplicationManager app;

    public ItemListContainerSteps(ApplicationManager app) {
        ItemListContainerSteps.app = app;
    }

//    @When("All products page is opened")
//    public void allProductsPageIsOpened() {
//        app.goToAllProductsPage();
//    }

    @Then("All products page is loaded")
    public void allProductsPageIsLoaded() {
        Assert.assertTrue(app.getItemListContainerHelper().isContainerPresent());
    }
}
