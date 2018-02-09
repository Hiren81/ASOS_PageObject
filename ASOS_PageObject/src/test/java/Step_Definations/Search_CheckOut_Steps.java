package Step_Definations;

import ASOS_Pages.Checkout_Page;
import ASOS_Pages.HomePage;
import ASOS_Pages.ProductSearchPage;
import ASOS_Pages.Product_Details_Page;
import baseMain_Utility.Base_Main;
import baseTest_Utility.Sleep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;



public class Search_CheckOut_Steps {


    HomePage homePage;
    Product_Details_Page productDetails;
    ProductSearchPage productSearch;
    Checkout_Page checkout;

    @Given("^user is on HomePage$")
    public void userIsOnHomePage() {
        Base_Main baseMain=new Base_Main();
        baseMain.openBrowser();
        homePage = new HomePage();
    }


    @When("^user enter \"([^\"]*)\" name and click submit$")
    public void userEnterName(String product)  {
        homePage.enterSearchBox(product);

    }

    @Then("^user select the product$")
    public void userSelectTheProduct() {
        productSearch=new ProductSearchPage();
        Sleep.sleepTimer(2000);
        productSearch.clickSearchedProduct();

    }

    @Then("^user enter the \"([^\"]*)\" details$")
    public void userEnterTheSizeDetails(String sizeIn) {
        productDetails=new Product_Details_Page();
        Sleep.sleepTimer(3000);
        productDetails.select_Product_sizeIn(sizeIn);
    }

    @Then("^user click add to Bag$")
    public void userClickAddToBag() {
        productDetails.click_add_to_Bag_Button();
    }

    @Then("^user check the shpooing Bag$")
    public void userCheckTheShpooingBag() {
        Sleep.sleepTimer(2000);
       productDetails.view_Shopping_Bag();
    }

    @Then("^user check out$")
    public void userCheckOut()  {
        checkout=new Checkout_Page();
        Sleep.sleepTimer(2000);
        Assert.assertEquals(checkout.assertTextPrest(),"Items are reserved for 60 minutes");
      checkout.click_Checkout_Button();
    }
}