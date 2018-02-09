package ASOS_Pages;

import baseMain_Utility.Base_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductSearchPage extends Base_Main {


    @FindBy(xpath = "//span[contains(.,'Adidas Shell Aop Leggings')]")
    private WebElement searched_product;



    public void clickSearchedProduct(){
        searched_product.click();
    }

}
