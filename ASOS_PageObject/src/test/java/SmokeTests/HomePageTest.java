package SmokeTests;

import ASOS_Pages.HomePage;
import baseTest_Utility.Driver_Factory;
import baseTest_Utility.Sleep;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends Driver_Factory {
   HomePage homePage = new HomePage();
    @Test
    public void searchProduct(){
       homePage=new HomePage();
        homePage.enterSearchBox("nike");
        Sleep.sleepTimer(3000);
        Assert.assertEquals(homePage.assertTextHomePage(), "Nike");
    }

    @Test
    public void gotoJoinASOS(){
       homePage=new HomePage();
        Sleep.sleepTimer(3000);
        homePage.gotoJoinASOS();
    }
    @Test
    public void gotoSignInPage(){
       homePage=new HomePage();
        Sleep.sleepTimer(3000);
        homePage.gotoSignInPage();
    }
}
