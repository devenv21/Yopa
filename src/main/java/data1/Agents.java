package data1;

import org.openqa.selenium.By;

/**
 * Created by Dev on 18/03/2017.
 */
public class Agents extends DriverManager
{

    public static void agents()
    {
        driver.findElement(By.cssSelector("nav.hero--nav:nth-child(4) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();

        System.out.println("Our Agents Displayed");
    }
}
