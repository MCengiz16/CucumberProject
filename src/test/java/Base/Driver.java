package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver  {
 public static String browser ="chrome";


    public static WebDriver driver() {
    WebDriver driver;

        if (browser.equalsIgnoreCase("firefox")) {


            WebDriverManager.firefoxdriver().setup();

            driver= new FirefoxDriver ();
        }



        else if (browser.equalsIgnoreCase("edge")) {


            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver ();
        }
        else if(browser.equalsIgnoreCase("ie")) {


            WebDriverManager.iedriver().setup();
            driver= new InternetExplorerDriver ();
        }
        else {



            WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver ();

        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;


    }
}
