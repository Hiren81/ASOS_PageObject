package Step_Definations;

import ASOS_Pages.HomePage;
import ASOS_Pages.JoinASOS;
import baseMain_Utility.Base_Main;
import baseTest_Utility.Sleep;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class SearchProducts_Steps {
    HomePage homePage;
    Base_Main baseMain;
    JoinASOS join;

    @Before
    public void openBrowser(){

    }
    @After
    public void closeBrowser(){

    }

    @Given("^user is on Home Page$")
    public void uaerIsOnHomePage() {
        baseMain=new Base_Main();
        homePage=new HomePage();
        baseMain.openBrowser();

}

    @When("^user enter product name$")
    public void userEnterProductName() {

        homePage.enterSearchBox("Adidas");

    }

    @And("^click submit$")
    public void clickSubmit() {
        System.out.println("Click submit");
    }

    @Then("^user can see the product$")
    public void userCanSeeTheProduct() {
        Sleep.sleepTimer(3000);
        Assert.assertEquals(homePage.assertTextHomePage(), "Adidas");

    }


    @When("^user click join button$")
    public void userClickJoinButton() {
        homePage.gotoJoinASOS();

    }

    @And("^enter detials and submit$")
    public void enterDetialsAndSubmit() {
        join = new JoinASOS();
        Sleep.sleepTimer(3000);
        join.enterEmail("sacjad@gmail.com");
        join.enterFirstName("sachin");
        join.enterLastName("Jadhav");
        join.setPassword("sachin");
        join.selectDOB("10", "March", "1990");
        Sleep.sleepTimer(3000);
        //   join.selectGender("male");
        join.setMarketingCheckBox();
        join.clickSubmitButton();

    }

    @Then("^user account created$")
    public void userAccountCreated() {
        System.out.println("user account created");
        //  driver.quit();
    }

    @And("^enter detials from table and submit$")
    public void enterDetialsFromTableAndSubmit(DataTable table) throws Throwable {
        //Sleep.sleepTimeer(3000);
        join = new JoinASOS();
        System.out.println(table);
        List<List<String>> data = table.raw();
        Sleep.sleepTimer(3000);
        join.enterEmail(data.get(1).get(1));
        join.enterFirstName(data.get(2).get(1));
        join.enterLastName(data.get(3).get(1));
        join.setPassword(data.get(4).get(1));
        join.selectDOB(data.get(5).get(1), data.get(6).get(1), data.get(7).get(1));
        join.setMarketingCheckBox();
        join.clickSubmitButton();

    }

    @Given("^user is on \"([^\"]*)\"$")
    public void userIsOn(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

