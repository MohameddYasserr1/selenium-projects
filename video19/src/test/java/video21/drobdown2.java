//hena bagrab anwa3 el select
package video21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drobdown2 {
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
        sel.selectByValue("1");
    }
    @Test
    void test2() {
        WebElement ele = driver.findElement(By.cssSelector("select[id=\"dropdown\"]"));
        Select sel2 = new Select(ele);
        sel2.selectByContainsVisibleText("Option 2");
    }
    @Test
    void test3() {
    driver.findElements(By.tagName("Option")).get(1).click();
    }
}
