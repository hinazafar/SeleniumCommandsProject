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

        //isDisplayed()
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //if the element is displayed or not
        System.out.println("Display Status of logo is: "+logo.isDisplayed());

        //isEnabled
        WebElement fname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        //if the element is enabled/operational or disabled/inactive
        System.out.println("First Name's Enabled status is: " + fname.isEnabled());

        //isSelected()
        WebElement male_rb = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rb = driver.findElement(By.xpath("//input[@id='gender-female']"));
        //if the element is selected or not . mostly used for radio buttons/check boxes/dropdown
        //before selection
        System.out.println("Before Selection");
        System.out.println("Male Radio Button selected status is: " + male_rb.isSelected());
        System.out.println("Female Radio Button selected status is: " + female_rb.isSelected());

        //After selection
        System.out.println("After Selection");
        male_rb.click();
        System.out.println("Male Radio Button selected status is: " + male_rb.isSelected());
        female_rb.click();
        System.out.println("Female Radio Button selected status is: " + female_rb.isSelected());
    }
}
