package video20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testwebsite {
    ChromeDriver driver;
    @BeforeMethod
    void before() {
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");}
    @Test
    void test1() {driver.findElement(By.id("username")).sendKeys("tomsmith"); //badawr 3ala el khana el hktb feha w bb3t el hktbo
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("fa-2x")).click();}
    @Test
    void test2() {driver.findElement(By.id("username")).sendKeys("tomsmith"); //badawr 3ala el khana el hktb feha w bb3t el hktbo
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345567!");
        driver.findElement(By.className("fa-2x")).click();}
    @AfterMethod
    void done() {driver.quit();}
}