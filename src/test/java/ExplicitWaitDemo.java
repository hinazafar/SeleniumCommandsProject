import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //declaration

        

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();
        WebElement usernametxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))); //usage
        usernametxt.sendKeys("Admin");

        WebElement passwordtxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))); //usage
        passwordtxt.sendKeys("admin123");

        WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))); //usage of explicit wait starts with condition
        loginbtn.click();
    }
}
