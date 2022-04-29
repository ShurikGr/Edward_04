import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class FirstTest extends BaseUtils{
    WebDriver driver = new ChromeDriver();

    @Test
    public void FirstTest(){
         driver.get("https://www.google.com/");
         driver.findElement(By.className("gNO89b")).click();
         driver.findElement(By.name("q")).sendKeys("Selenium");
         driver.findElement(By.className("gNO89b")).click();

    }


}
