import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class locators_for_F01 {


    WebElement css(String x) {
        return F01_login.driver.findElement(By.cssSelector(x));
    }
    WebElement id(String y) {
        return F01_login.driver.findElement(By.id(y));
    }
    WebElement xpath(String z) {
        return F01_login.driver.findElement(By.xpath(z));
    }
    WebElement cn(String i) {
        return F01_login.driver.findElement(By.className(i));
    }
}
