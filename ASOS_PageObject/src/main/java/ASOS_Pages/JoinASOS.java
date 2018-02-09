package ASOS_Pages;

import baseMain_Utility.Base_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class JoinASOS extends Base_Main {


    @FindBy(xpath="//input[@id=\"Email\"]")
    private WebElement emailID;

    @FindBy(xpath="//input[@id=\"FirstName\"]")
    private WebElement firstName;

    @FindBy(xpath="//input[@id=\"LastName\"]")
    private WebElement lastName;

    @FindBy(xpath="//input[@id=\"Password\"]")
    private WebElement password;

//    @FindAll(@FindBy (id="BirthDay"))
//    private List<WebElement> birthDay;
//    @FindAll(@FindBy (id="BirthMonth"))
//    private List<WebElement> birthMonth;
//    @FindAll(@FindBy (id="BirthYear"))
//    private List<WebElement> birthYear;

    @FindBy(id="BirthDay")
    WebElement birthDaySelect;
    @FindBy(id="BirthMonth")
    WebElement birthMonthSelect;
    @FindBy(id="BirthYear")
    WebElement birthYearSelect;

    @FindBy(xpath="//input[@name='Gender' and @value='M']")
    private WebElement male;

    @FindBy(xpath="//input[@id=\"female\" and @value=\"F\"]")
    private WebElement female;

    @FindBy(xpath = "//label[@for=\"Marketing\"]")
    private WebElement marketingCheckBox1;

    @FindBy(xpath = "//span[@class=\"qa-partner-marketing-label\"]")
    private WebElement marketingCheckBox2;

    @FindBy(xpath = "//input[@id=\"register\"]")
    private WebElement submitButton;


    public void enterEmail(String email){
        emailID.sendKeys(email);

    }
    public void enterFirstName(String FirstName){
        firstName.sendKeys(FirstName);

    }
    public void enterLastName(String LastName){
        lastName.sendKeys(LastName);

    }
    public void setPassword(String passWord){
        password.sendKeys(passWord);
    }

//    public void enterDOB(String birthDayIn){
//        for(WebElement bd: birthDay){
//
//        }
//        for(WebElement bm: birthMonth){
//            System.out.println(bm);
//
//        }
//        for(WebElement by: birthYear){
//            System.out.println(by);
//        }
//
//    }

    public void selectDOB(String birthDayIn,String birthMonthIn,String birthYearIn){
        Select dob = new Select(birthDaySelect);
        dob.selectByValue(birthDayIn);
       Select mob = new Select(birthMonthSelect);
        mob.selectByVisibleText(birthMonthIn);
        Select yob = new Select(birthYearSelect);
        yob.selectByValue(birthYearIn);
    }
    public void selectGender(String gender){
        //male.clear();
       // female.clear();
        if(gender.equalsIgnoreCase("male")){
            male.click();
        }
        else if(gender.equalsIgnoreCase("female"))
            female.click();
    }

    public void setMarketingCheckBox(){
        marketingCheckBox1.click();
        marketingCheckBox2.click();
    }
    public  void clickSubmitButton(){
        submitButton.click();
    }

}
