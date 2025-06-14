package video21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
    ChromeDriver driver;
    @BeforeTest
    void before(){
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }
    @Test
    void test_a() {
        driver.findElement(By.cssSelector("input[id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[id=\"login-button\"]")).click();
        boolean x = driver.findElement(By.cssSelector("select[class=\"product_sort_container\"]")).isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x,"false one");
        soft.assertAll();

    }
}