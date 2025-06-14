// hena ana ba test ezay momkn a login f page
package video19;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class A {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith"); //badawr 3ala el khana el hktb feha w bb3t el hktbo
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("fa-2x")).click();
    }
}
