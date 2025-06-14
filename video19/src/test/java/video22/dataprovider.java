//eb2aa garab bl assert
package video22;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

    ChromeDriver driver;
    @BeforeMethod
    void before() {
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }


    @Test (dataProvider = "gd")
    void test1 (String a , String b)
    {
        driver.findElement(By.id("username")).sendKeys(a);
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(b);
        driver.findElement(By.className("fa-2x")).click();
    }

    @DataProvider (name = "gd")
    String [][] gd () {
        String A [][]= {{"ahmed","54421"},{"tomsmith","SuperSecretPassword!"},{"ahmed","1234"}};
        return A;
    }

}
