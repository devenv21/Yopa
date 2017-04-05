package data1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dev on 18/03/2017.
 */
public class DriverManager {

    public static WebDriver driver;
    public static String URL;
    public static String Browser;
    public LoadProp loadProp = new LoadProp();

    public void openBrowser()  {
        Browser = loadProp.getProperty("Browser");

        if (Browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (Browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        URL = loadProp.getProperty("URL");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
}
