package com.automation.exercise.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
    plugin =  {"html:target/cucumber-report.html"},
    features = "src/test/resources/features/api",
    glue = "com.automation.exercise.stepDefinitions",
    tags = "@API")
@RunWith(CucumberWithSerenity.class)
public class ApiTestRunner {

}
