package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D02_login {
    ChromeDriver driver;

    @Given("user will open browser")
    public void user_will_open_browser() {
        driver = new ChromeDriver();
    }

    @And("user will open website URL")
    public void user_will_open_website_URL() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("^user enters valid (.*) and (.*) fields$")
    public void user_enters_valid_username_and_password (String x, String y) {
        driver.findElement(By.cssSelector("input[id=\"user-name\"]")).sendKeys(x);
        driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys(y);
    }

    @And("clicks login button")
    public void clicks_login_button() {
        driver.findElement(By.cssSelector("input[value=\"LOGIN\"]")).click();
    }

    @Then("user will login successfully")
    public void user_will_login_successfully() {
        boolean z = driver.findElement(By.cssSelector("div[class=\"product_label\"]")).isDisplayed();
        Assert.assertTrue(z);
    }

}