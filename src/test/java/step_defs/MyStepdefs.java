package step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(arg0);
        element.submit();
    }
}
