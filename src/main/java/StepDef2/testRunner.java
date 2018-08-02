package StepDef2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.it.Date;
import cucumber.api.junit.Cucumber;

// runner class

@RunWith(Cucumber.class)
//@Cucumber.Options(format={"html:output"})
@CucumberOptions(features = { "/bdd.cucumber/src/main/resources/Features/dailyroutine.feature" },

// Glue - To provide the path of stepDefinitions package
glue = { "pretty", "json:target/cucumber.json" }, 
plugin = { "pretty", "json:target/cucumber.json" })
public class testRunner {
	
	
	
	
	
}
