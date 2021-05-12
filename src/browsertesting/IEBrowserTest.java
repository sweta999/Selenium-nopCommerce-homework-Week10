package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class IEBrowserTest {

    public static void main(String[] args){

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.nopcommerce.com/demo");

        System.out.println(driver.getTitle());  //Ans - Store Demo - nopCommerce
        System.out.println(driver.getTitle().length()); //Ans - 24
        System.out.println(driver.getTitle().equals("Store Demo - nopCommerce"));  //true
        System.out.println(driver.getTitle().contains("Store Demo")); //true

        driver.close();

    }


}
