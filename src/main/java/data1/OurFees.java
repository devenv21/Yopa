package data1;

import org.openqa.selenium.By;

/**
 * Created by Dev on 18/03/2017.
 */
public class OurFees extends DriverManager{

    public void ourFees()
    {
        driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div[2]/nav/ul/li[2]/a")).click();
        System.out.println("Our Fees Page Displayed");
        // abc

    }
}
