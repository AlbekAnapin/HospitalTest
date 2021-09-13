import EmergencyRoomTest.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthorizationTests {
    WebDriver driver = new ChromeDriver();

        @Test
    public void Authorization () {
        driver.get("https://uat.dmed.kz");
        driver.findElement(By.id("tbUserName")).sendKeys("kmis_octo_726");
        driver.findElement(By.id("tbPassword")).sendKeys("Asdsadas123@");
        WebElement login = driver.findElement(By.xpath("//button[text()= 'Войти']"));
        login.click();

        WaitUntil.WaitElement(driver, By.xpath("//li[@class='auth-service']"));
        driver.findElement(By.xpath("//li[@class='auth-service']")).click();

    }


}