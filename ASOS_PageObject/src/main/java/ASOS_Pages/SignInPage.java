package ASOS_Pages;

import baseMain_Utility.Base_Main;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends Base_Main {

    @FindBy(xpath = "//input[@id=\"EmailAddress\"]")
    private WebElement enterEmailid;

    @FindBy(xpath = "//input[@id=\"Password\"]")
    private WebElement enterPassword;

    @FindBy(xpath = "//input[@id=\"signin\"]")
    private WebElement submit;

    public void setEnterEmailid(String emailid){
        enterEmailid.sendKeys(emailid);
    }
    public void setEnterPassword(String password){
        enterPassword.sendKeys(password);
    }
    public void setSubmit(){
        submit.click();
    }
}

