package com.telran.project;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "src/test/resources/features",
        features = "src/test/resources/features/Login.feature",
//        tags = "@scenarioOutline",
//        tags = "~@wip",
        tags = "@currently-working",
//      tags = "(@smoke or @ui) and (not @slow)",
        glue = {"com.telran.project.steps"},
//      plugin = {"pretty","json:build/cucumber-report/cucumber.json"}
        plugin = {"pretty", "html:target/cucumber.html"}
)

public class RunTests {
}
