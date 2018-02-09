package SmokeTests;

import ASOS_Pages.Checkout_Page;
import ASOS_Pages.HomePage;
import ASOS_Pages.ProductSearchPage;
import ASOS_Pages.Product_Details_Page;
import baseTest_Utility.Driver_Factory;
import baseTest_Utility.Sleep;
import org.junit.Assert;
import org.junit.Test;


public class SearchProduct_Test extends Driver_Factory
{
    HomePage homePage;
    ProductSearchPage product;
    Product_Details_Page details_page;
    Checkout_Page checkoutPage;
    @Test
    public void searchProduct(){
        homePage=new HomePage();
        product=new ProductSearchPage();
        details_page=new Product_Details_Page();
        checkoutPage=new Checkout_Page();

        homePage.enterSearchBox("Adidas");
        Assert.assertEquals("Adidas",homePage.assertTextHomePage());
        product.clickSearchedProduct();
        details_page.select_Product_size();
        details_page.click_add_to_Bag_Button();
        Sleep.sleepTimer(3000);
        details_page.view_Shopping_Bag();
        Assert.assertEquals("Items are reserved for 60 minutes",checkoutPage.assertTextPrest());
        checkoutPage.click_Checkout_Button();
    }
}