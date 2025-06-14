package video20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment {
    ChromeDriver driver;
    @BeforeTest void begin() {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }
    @Test void test() {
        driver.findElement(By.cssSelector("a[ href=\"/login\"]")).click();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("memes");
        driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]")).sendKeys("memes1bas@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]")).click();
        driver.findElement(By.cssSelector("input[id=\"id_gender1\"]")).click();
        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("memesmemes222");

        Select sel1= new Select(driver.findElement(By.cssSelector("select[id=\"days\"]")));
        sel1.selectByIndex(7);

        Select sel2= new Select(driver.findElement(By.cssSelector("select[id=\"months\"]")));
        sel2.selectByIndex(10);

        Select sel3= new Select(driver.findElement(By.cssSelector("select[id=\"years\"]")));
        sel3.selectByIndex(5);




        driver.findElement(By.cssSelector("input[name=\"newsletter\"]")).click();


        driver.findElement(By.cssSelector("input[name=\"optin\"]")).click();

        driver.findElement(By.cssSelector("input[id=\"first_name\"]")).sendKeys("mems");
        driver.findElement(By.cssSelector("input[id=\"last_name\"]")).sendKeys("sano");
        driver.findElement(By.cssSelector("input[id=\"company\"]")).sendKeys("ekalosha");
        driver.findElement(By.cssSelector("input[id=\"address1\"]")).sendKeys("aliali");
        driver.findElement(By.cssSelector("input[id=\"address2\"]")).sendKeys("taleb");

        Select sel4= new Select(driver.findElement(By.cssSelector("select[id=\"country\"]")));
        sel4.selectByIndex(4);

        driver.findElement(By.cssSelector("input[id=\"state\"]")).sendKeys("newyork");
        driver.findElement(By.cssSelector("input[id=\"city\"]")).sendKeys("usa");
        driver.findElement(By.cssSelector("input[id=\"zipcode\"]")).sendKeys("2244");
        driver.findElement(By.cssSelector("input[id=\"mobile_number\"]")).sendKeys("01125623833");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

    }

}
