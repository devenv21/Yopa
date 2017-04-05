package data1;

import org.openqa.selenium.By;

import static data1.DriverManager.driver;

/**
 * Created by Dev on 18/03/2017.
 */
public class PropertySearch
{
    public void search()
    {
        driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div[2]/nav/ul/li[4]/a")).click();
        System.out.println("Property Search page Displayed");
    }
}
