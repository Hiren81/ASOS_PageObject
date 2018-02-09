package ASOS_Pages;

import baseMain_Utility.Base_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by SOHAM on 01/02/2017.
 */
public class Checkout_Page extends Base_Main {

    @FindBy(xpath = "//div[@class=\"bag-title-holder\"]/p")
    private WebElement text_confirmation;

//    @FindBy(xpath = "//a[@class=' bag-total-button bag-total-button--checkout bag-total-button--checkout--total']")
//    private WebElement checkout_button;
    @FindBy(css = ".bag-total-button.bag-total-button--checkout.bag-total-button--checkout--total")
    private WebElement checkout_button;

    public String assertTextPrest(){
        return text_confirmation.getText();
    }

    public void click_Checkout_Button(){
        checkout_button.click();
    }
}
