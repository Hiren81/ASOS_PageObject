package SmokeTests;

import ASOS_Pages.HomePage;
import ASOS_Pages.JoinASOS;
import baseTest_Utility.Driver_Factory;
import baseTest_Utility.Sleep;
import org.junit.Test;

public class JoiinASOS_Test extends Driver_Factory {
    HomePage homePage;
    JoinASOS join;
    @Test
    public void joinASOS(){
        homePage=new HomePage();
        join=new JoinASOS();
        homePage.gotoJoinASOS();
        Sleep.sleepTimer(3000);
        join.enterEmail("sacjad@gmail.com");
        join.enterFirstName("sachin");
        join.enterLastName("Jadhav");
        join.setPassword("sachin123");
        Sleep.sleepTimer(3000);
        join.selectDOB("10","March","1990");
        Sleep.sleepTimer(1000);
       // join.selectGender("male");
        join.setMarketingCheckBox();
        join.clickSubmitButton();
    }
}
