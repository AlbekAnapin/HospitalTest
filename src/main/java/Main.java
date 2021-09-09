import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC-Damu-2\\Desktop\\autoTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://uat.dmed.kz");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
        //    .until(ExpectedConditions.presenceOfElementLocated(By.id("`tbUserName"))));


        driver.findElement(By.id("tbUserName")).sendKeys("kmis_octo_726");
        driver.findElement(By.id("tbPassword")).sendKeys("Asdsadas123@");
        WebElement login = driver.findElement(By.xpath("//button[text()= 'Войти']"));
        login.click();

    }
}
