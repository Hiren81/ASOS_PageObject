package SmokeTests;

import ASOS_Pages.HomePage;
import ASOS_Pages.SignInPage;
import baseTest_Utility.Driver_Factory;
import org.junit.Test;


public class SignInPageTest extends Driver_Factory {
    HomePage homePage;
    SignInPage signIn;
    @Test
    public void signInTest(){
        homePage=new HomePage();
        signIn=new SignInPage();
        homePage.gotoSignInPage();
        signIn.setEnterEmailid("sacjad@gmail.com");
        signIn.setEnterPassword("sachin");
        signIn.setSubmit();
    }
}
