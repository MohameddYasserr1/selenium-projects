package video21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert2 {

    ChromeDriver driver;
    @BeforeMethod
    void before() {
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");}
    @Test
    void test1() {driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("fa-2x")).click();
     boolean x = driver.findElement(By.cssSelector("i[class=\"icon-2x icon-signout\"]")).isDisplayed();
        Assert.assertTrue(x,"false one");
        SoftAssert soft = new SoftAssert();
    }}