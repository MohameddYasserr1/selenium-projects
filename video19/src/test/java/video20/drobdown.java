package video20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drobdown {
    ChromeDriver driver;
    @BeforeTest
    void before() {
         driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    @Test
    void test1() {
        WebElement ele = driver.findElement(By.cssSelector("select[id=\"dropdown\"]"));
        Select sel = new Select(ele);
        sel.selectByIndex(2);
    }
}
