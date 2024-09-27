package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	    features = "src/test/resources/features",
	    glue = "stepDefinitions",
	    plugin = { "pretty", "html:target/cucumber-reports.html" },
	    monochrome = true

)
public class Runner {

}
