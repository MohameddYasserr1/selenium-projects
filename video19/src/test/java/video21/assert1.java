package video21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assert1 {

        ChromeDriver driver;
        @BeforeMethod
        void before() {
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/dropdown");
        }
        @Test
        void test1() {
            WebElement ele = driver.findElement(By.cssSelector("select[id=\"dropdown\"]"));
            Select sel = new Select(ele);
            sel.selectByValue("2");
            boolean y = driver.findElement(By.cssSelector("option[value=\"2\"]")).isSelected();
            Assert.assertEquals(y,true,"failed test");
        }


}
