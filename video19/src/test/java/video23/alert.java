// hena de anwa3 el alerts el btzhar ama bfta7 mawke3 mslun
package video23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class alert {
    SoftAssert ass = new SoftAssert();
    ChromeDriver driver;

    @BeforeMethod
    void before() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    void test1() {
        driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]")).click();
        driver.switchTo().alert().accept();
        boolean x = driver.findElement(By.xpath("//p[.=\"You successfully clicked an alert\"]")).isDisplayed();
        Assert.assertTrue(x, "no result");
    }

    @Test
    void test2() {
        driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]")).click();
        String s = driver.switchTo().alert().getText();
        if (s.equals("I am a JS Confirm")) {

            driver.switchTo().alert().accept();
            boolean x = driver.findElement(By.xpath("//p[.=\"You clicked: Ok\"]")).isDisplayed();
            ass.assertTrue(x);
        } else {
            driver.switchTo().alert().dismiss();
            boolean x = driver.findElement(By.xpath("//p[.=\"You clicked: Cancel\"]")).isDisplayed();
            ass.assertTrue(x);
        }


    }

    @Test
    void test3() {
        driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]")).click();
        String s = driver.switchTo().alert().getText();
        if (s.equals("I am a JS promptt")) {
            driver.switchTo().alert().sendKeys("mohamed");
            driver.switchTo().alert().accept();
            boolean x = driver.findElement(By.xpath("//p[.=\"You entered: mohamed\"]")).isDisplayed();
            ass.assertTrue(x);
        } else {
            driver.switchTo().alert().dismiss();
            boolean x = driver.findElement(By.xpath("//p[.=\"You entered: null\"]")).isDisplayed();
            ass.assertTrue(x);
        }
    }
}