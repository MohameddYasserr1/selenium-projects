package video20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class autoexercise {
    ChromeDriver driver;
    @BeforeTest
    void begin() { driver= new ChromeDriver();
    driver.get("https://automationexercise.com/");}
    @Test
    void test(){
        driver.findElement(By.cssSelector("a[ href=\"/login\"]")).click();
        driver.findElement(By.cssSelector("input[ type=\"email\"]")).sendKeys("tomsmith@gmail.com");
        driver.findElement(By.cssSelector("input[ type=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[ type=\"submit\"]")).click();
    }
    @AfterTest
    void after() {
        driver.quit();
        System.out.println("finish");
    }
}
