package ASOS_Pages;

import baseMain_Utility.Base_Main;
import baseMain_Utility.Sleep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SOHAM on 01/02/2017.
 */
public class HomePage extends Base_Main {


    @FindBy(xpath="//div[@class=\"search\"]/input")
    protected WebElement searchBox;

    @FindBy(xpath="//a[@class=\"go\"]/span")
    protected WebElement searchBoxclick;

    @FindBy(xpath="//div[@id=\"anonymous\"]/a[1]")
    protected WebElement JoinASOS;

    @FindBy(xpath="//div[@id=\"anonymous\"]/a[2]")
    protected WebElement signIn;

    @FindBy(xpath="//div[@class=\"product-list\"]/div/h1")
    protected WebElement searchAssertText;



    public void enterSearchBox(String using){
        searchBox.clear();
        searchBox.sendKeys(using);
        searchBoxclick.click();

    }
    public String assertTextHomePage(){
        System.out.println(searchAssertText.getText());
        return searchAssertText.getText();
    }

    public void gotoJoinASOS(){
        Sleep.sleepTimer(3000);
        JoinASOS.click();
    }
    public void gotoSignInPage(){
        Sleep.sleepTimer(3000);
       signIn.click();
    }

}
