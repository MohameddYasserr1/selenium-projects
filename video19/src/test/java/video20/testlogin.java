package video20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testlogin {
    ChromeDriver driver;
    @BeforeTest
    void begin() {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/"); }
    @Test
    void test() {
        driver.findElement(By.cssSelector("a[ href=\"/login\"]")).click();
        driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]")).sendKeys("memes1bas@gmail.com");
        driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]")).sendKeys("memesmemes222");
        driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]")).click();
    }

}
