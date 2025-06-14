package video23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class upload {
    ChromeDriver driver;

    @BeforeMethod
    void before() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
    }
    @Test
    void test_a () {
        driver.findElement(By.cssSelector("input[id=\"file-upload\"]")).sendKeys("C:\\Users\\Mohamed Salem\\Desktop\\WIN_20250525_18_03_55_Pro.jpg");
        driver.findElement(By.cssSelector("input[id=\"file-submit\"]")).click();
        boolean x = driver.findElement(By.tagName("h4")).isDisplayed();
        Assert.assertTrue(x,"no");
    }
}
