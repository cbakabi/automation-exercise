package com.automation.exercise.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber-report.html"},
    features = "src/test/resources/features/ui",
    glue = "com.automation.exercise.stepDefinitions",
    tags = "@UI")
@RunWith(CucumberWithSerenity.class)
public class UiTestRunner {

}
