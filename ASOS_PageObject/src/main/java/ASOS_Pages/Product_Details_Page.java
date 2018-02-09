package ASOS_Pages;

import baseMain_Utility.Base_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;


public class Product_Details_Page extends Base_Main {


    @FindBy(xpath = "//select[@data-id=\"sizeSelect\"]")
    private WebElement product_size;

    @FindBy(xpath = "//span[contains(.,'Add to bag')]")
    private WebElement add_to_bag_button;

    @FindBy(xpath = "//div[@class=\"miniBag-holder\"]/a/span[1]")
    private WebElement view_Bag;



    public void select_Product_size(){
        Select size=new Select(product_size);
        size.selectByVisibleText("UK 8");
    }
    public void select_Product_sizeIn(String sizeIn){
        Select size=new Select(product_size);
        size.selectByVisibleText(sizeIn);
    }

    public void click_add_to_Bag_Button(){
    add_to_bag_button.click();
    }
    public void view_Shopping_Bag(){
   view_Bag.click();
    }
}
