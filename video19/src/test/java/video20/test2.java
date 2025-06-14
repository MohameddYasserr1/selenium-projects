package video20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class test2 {
    ChromeDriver driver;
    @BeforeTest
    void before() {
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");}
    @Test
    void test1() {driver.findElement(By.id("username")).sendKeys("tomsmith"); //badawr 3ala el khana el hktb feha w bb3t el hktbo
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("fa-2x")).click();
    }
    @Test
    void test2() { driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith"); //badawr 3ala el khana el hktb feha w bb3t el hktbo
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345567!");
        driver.findElement(By.className("fa-2x")).click();}
    @AfterTest
    void done() {driver.quit();}
}
