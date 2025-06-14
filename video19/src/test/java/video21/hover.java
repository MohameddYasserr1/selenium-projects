package video21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hover {

    ChromeDriver driver;
    @BeforeTest
    void before(){
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
    }
    @Test
    void test_a() {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//h5[.=\"name: user2\"]//parent::div//parent::div//img"))).perform();
        driver.findElement(By.cssSelector("a[href=\"/users/2\"]")).click();
        boolean x = driver.findElement(By.xpath("//h1[.=\"Not Found\"]")).isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(true,"no respond");
        soft.assertAll();


    }

}