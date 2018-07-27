package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "/bdd.cucumber/src/main/resources" },

		// Glue - To provide the path of stepDefinitions package
		glue = { "pretty", "json:target/cucumber.json" }, plugin = { "pretty", "json:target/cucumber.json" })
/*
 * @RunWith(FbLogin.class)
 * 
 * @CucumberOptions( // format = {"pretty", "json:target/cucumber.json"},
 * features = {"/bdd.cucumber/src/main/resources", glue = [("pretty",
 * "json:target/cucumber.json")] plugin = [("pretty",
 * "json:target/cucumber.json")] }
 */

public class TestRunner {

}
