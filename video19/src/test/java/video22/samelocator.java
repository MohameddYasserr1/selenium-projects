package video22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class samelocator {

    ChromeDriver driver;
    @BeforeMethod
    void before() {
        driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
    }
    @Test
    void test1() {
        driver.findElement(By.xpath("//strong[.=\"Austria\"]//parent::td//parent::tr//input")).click();
        driver.findElement(By.xpath("//strong[.=\"Armenia\"]//parent::td//parent::tr//input")).click();

    }


}
