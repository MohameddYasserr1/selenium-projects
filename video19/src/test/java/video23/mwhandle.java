package video23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class mwhandle {
    ChromeDriver driver;

    @BeforeMethod
    void before() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
    }
    @Test
    void test_a () {
        driver.findElement(By.xpath("//a[.=\"Click Here\"]")).click();
        System.out.println(driver.getCurrentUrl());
        ArrayList <String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
    }
}
