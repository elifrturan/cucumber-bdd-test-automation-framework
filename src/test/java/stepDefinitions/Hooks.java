package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.MyDriver;

import java.time.Duration;

public class Hooks {

    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = MyDriver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        MyDriver.closeDriver();
    }
}
