import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {
        // Conditional Methods/commands can be accessed through webElements
        // returns boolean value (true/false)

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //if the element is displayed or not
        //System.out.println("Display Status of logo is: "+logo.isDisplayed());

        WebElement fname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        System.out.println("First Name's Enabled status is: " + fname.isEnabled());

    }
}
