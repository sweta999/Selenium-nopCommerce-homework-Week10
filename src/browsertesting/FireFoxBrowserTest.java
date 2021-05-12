package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowserTest {

    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.nopcommerce.com/demo");

        System.out.println(driver.getTitle()); //Ans - Store Demo - nopCommerce
        System.out.println(driver.getTitle().length()); //Ans - 24
        System.out.println(driver.getTitle().equals("Store Demo - nopCommerce")); //true
        System.out.println(driver.getTitle().contains("Nopcommerce")); //false

        driver.close();
    }

}
