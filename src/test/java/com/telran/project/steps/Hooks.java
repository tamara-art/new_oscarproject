package com.telran.project.steps;

import com.telran.project.fw.ApplicationManager;
import io.cucumber.java.After;

public class Hooks {
    protected static ApplicationManager app;

    public Hooks(ApplicationManager app) {
        Hooks.app = app;
    }

//    @BeforeAll
//    public static void beforeAll() {
//        // Runs before all scenarios
//    }

    @After
    public void afterScenario() {
//        app.takeScreenShot();
        app.takeScreenshotWithScrollDown();
        app.stopApp();
        System.out.println("After is called!");
    }

//    @After("@browser and not @headless")
//    public void doSomethingAfter(Scenario scenario){
//        scenario.isFailed();
//    }
}
