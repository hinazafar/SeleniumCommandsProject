import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();
        // Both get() and navigate().to() functional works same but the difference is
        // get() method only accept the URL as string
        // whereas navigate().to() method also accept the URL object and the sting as well
        //driver.get("https://www.nopcommerce.com/");

        URL url = new URL("https://www.nopcommerce.com");
        driver.navigate().to(url);

        //* How navigate().to() Method Works *//
        // 1. First it checks if the passed argument is a string or an object
        // 2. If it is a string format it will directly pass it to get() method
        // 3. If it is an object(URL) , then it will convert it into string first
        // and then call the get() method

    }
}
