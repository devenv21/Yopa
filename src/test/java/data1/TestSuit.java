package data1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Dev on 18/03/2017.
 */
public class TestSuit extends DriverManager {

    @BeforeTest

    public void open()  {
        openBrowser();
    }


    @Test
    public static void links()
    {
        //calling about Yopa Page
        AboutYopa aboutYopaClick = new AboutYopa();
        aboutYopaClick.aboutYopa();

        //calling ourfees links
        OurFees ourFeesClick = new OurFees();
        ourFeesClick.ourFees();

        //calling agents page
        Agents agentsClick = new Agents();
        agentsClick.agents();

        //calling Property Search
        PropertySearch propertySearchClcik = new PropertySearch();
        propertySearchClcik.search();

        //calling News and Guides
        NewsAndGuides newsAndGuidesClick = new NewsAndGuides();
        newsAndGuidesClick.newsAndGuides();


    }

}
