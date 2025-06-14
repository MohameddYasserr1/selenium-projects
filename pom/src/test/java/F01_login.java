import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class F01_login {

    static ChromeDriver driver;
    locators_for_F01 loc = new locators_for_F01();
    @BeforeMethod
    void before() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
    }
    @Test
    void test_a() {
        loc.css("a[href=\"/login\"]").click();
        loc.id("username").sendKeys("tomsmith");
        loc.xpath("//input[@type=\"password\"]").sendKeys("SuperSecretPassword!");
        loc.cn("fa-2x").click();
        boolean x = loc.css("div[id=\"flash\"]").isDisplayed();
        Assert.assertTrue(x);
        boolean y = loc.css("i[class=\"icon-2x icon-signout\"]").isDisplayed();
        Assert.assertTrue(y);
    }

    @Test
    void test_b() {
        loc.css("a[href=\"/login\"]").click();
        loc.id("username").sendKeys("tomsmith");
        loc.xpath("//input[@type=\"password\"]").sendKeys("1234");
        loc.cn("fa-2x").click();
        boolean x = loc.css("div[id=\"flash\"]").isDisplayed();
        Assert.assertTrue(x);
        boolean y = loc.css("i[class=\"icon-2x icon-signout\"]").isDisplayed();
        Assert.assertTrue(y);
    }

}
