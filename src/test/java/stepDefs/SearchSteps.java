package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertThat;

public class SearchSteps extends DriverManager {



    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        openbrowser();
    }

    @When("^I search for a \"([^\"]*)\"$")
    public void i_search_for_a(String arg1)  {
       driver.findElement(By.id("findText")).clear();
       driver.findElement(By.id("findText")).sendKeys("Pasta");
       driver.findElement(By.id("findText")).sendKeys(Keys.ENTER);
    }

    @Then("^I should be able see desire product$")
    public void i_should_be_able_see_desire_product()  {
        String actualTital = driver.getTitle();
        assert actualTital.contains("Pasta");
    }
}
