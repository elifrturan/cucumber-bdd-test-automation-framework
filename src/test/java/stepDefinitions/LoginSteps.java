package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps extends Hooks {

    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver);
    }

    @And("user types username as {string}")
    public void userTypesUsernameAs(String username) {
        loginPage.setUsername(username);
    }

    @And("user types password as {string}")
    public void userTypesPasswordAs(String password) {
        loginPage.setPassword(password);
    }

    @When("click button")
    public void clickButton() {
        loginPage.clickButton();
    }

    @Then("assert to success")
    public void assertToSuccess() {
        loginPage.assertToSuccessMessage();
    }
}
