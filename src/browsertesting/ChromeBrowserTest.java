package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.nopcommerce.com/demo");

        System.out.println(driver.getTitle()); //Ans - Store Demo - nopCommerce
        System.out.println(driver.getTitle().length()); //Ans - 24
        System.out.println(driver.getTitle().equals("Store Demo - nopCommerce")); //true
        System.out.println(driver.getTitle().contains("Demo")); //true

        driver.close();

    }

}
