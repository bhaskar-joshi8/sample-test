package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/main/resource/feature/poctest.feature",glue = "stepDefinition")
	public class runner {

}
