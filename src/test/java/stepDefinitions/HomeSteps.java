package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeSteps extends Hooks {

    @Given("go to home page")
    public void goToHomePage() {
        driver.get("https://practicetestautomation.com/");
    }

    @When("wait two seconds")
    public void waitUntilHomePageLoads() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("post-title")));
    }

    @Then("see {string} text")
    public void seeText(String expectedText) {
        Assert.assertTrue(
                driver.findElement(By.className("post-title")).isDisplayed()
        );
    }
}
