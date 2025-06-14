package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D01_login {
    ChromeDriver driver;

    @Given("user open browser")
    public void user_open_browser() {
        driver = new ChromeDriver();
    }

    @And("user open website URL")
    public void user_open_website_URL() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }

    @And("user enters valid password")
    public void user_enters_valid_password() {
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("SuperSecretPassword!");
    }

    @And("user click login button")
    public void user_click_login_button() {
        driver.findElement(By.className("fa-2x")).click();
    }

    @Then("user login successfully")
    public void user_login_successfully() {
        boolean x = driver.findElement(By.cssSelector("i[class=\"icon-2x icon-signout\"]")).isDisplayed();
        Assert.assertTrue(x);
    }

    @And("user enters invalid password")
    public void user_enters_invalid_password() {
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("SuperSecretPassword");
    }

    @Then("user dont login successfully")
    public void user_dont_login_successfully() {
        boolean y = driver.findElement(By.cssSelector("i[class=\"icon-2x icon-signout\"]")).isDisplayed();
        Assert.assertTrue(y);
    }
}
