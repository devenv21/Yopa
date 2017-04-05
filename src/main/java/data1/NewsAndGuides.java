package data1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static data1.DriverManager.driver;

/**
 * Created by Dev on 18/03/2017.
 */
public class NewsAndGuides {
    public static String randomDate() {
        DateFormat format = new SimpleDateFormat("DDHHmmss");
        return format.format(new Date());
    }

    public void newsAndGuides() {
        driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div[2]/nav/ul/li[5]/a")).click();
        driver.findElement(By.cssSelector("#main-navigation > div > div.col-md-11.col-sm-12.hero--nav__wrapper > nav > ul > li.hero--nav--item.dropdown.open > ul > li:nth-child(1) > a")).click();
        System.out.println("News And Guides Page Displayed");

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        {
            try {
                FileUtils.copyFile(srcFile, new File("C:\\Users\\Dev\\Documents\\Screenshots" + randomDate() + ".png"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}