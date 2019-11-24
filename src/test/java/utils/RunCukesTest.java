package utils;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Feature;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/search.feature",glue = {"stepDefs"}, plugin = "json:target/cucumber.json")

public class RunCukesTest {

}
