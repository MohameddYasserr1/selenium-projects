package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class test_9 {
    ChromeDriver driver;
    @BeforeTest
    void begin() { driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");}
}
