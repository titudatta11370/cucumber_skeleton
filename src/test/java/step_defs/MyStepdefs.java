package step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepdefs {

    public WebDriver driver;

    public MyStepdefs()
    {
        driver = Hooks.driver;
    }

    @Given("I go to google site")
    public void iGoToGoogleSite() {
        driver.get("https://www.google.com/");
    }

    @And("I search for {string}")
    public void iSearchFor(String arg0) throws InterruptedException {
        WebElement element = new WebDriverWait(driver, 10).
                until(ExpectedConditions.elementToBeClickable(By.name("q")));
        element.sendKeys(arg0);
        element.submit();
    }

    @Then("I should see the result")
    public void iShouldSeeTheResult() {
        new WebDriverWait(driver, 10).
                until(ExpectedConditions.presenceOfElementLocated(By.id("res")));
    }
}
