import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();
        // Both get() and navigate().to() functional works same but the difference is
        // get() method only accept the URL as string
        // whereas navigate().to() method also accept the URL object or the sting as well
        //driver.get("https://www.nopcommerce.com/");
        URL url = new URL("https://www.nopcommerce.com");
        driver.navigate().to(url);

    }
}
