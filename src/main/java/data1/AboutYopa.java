package data1;

import org.openqa.selenium.By;

/**
 * Created by Dev on 18/03/2017.
 */
public class AboutYopa extends DriverManager
{
    public static void aboutYopa()
    {
            driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div[2]/nav/ul/li[1]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
            System.out.println("about Yopa Page Displayed");
    }


}
