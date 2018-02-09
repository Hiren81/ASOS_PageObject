package baseMain_Utility;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;


public class Base_Main {
    public static WebDriver driver;
    final String BROWSER="firefox";
    final String baseURL="http://www.asos.com/?hrd=1";

    public Base_Main(){
        PageFactory.initElements(driver,this );
    }

    public void openBrowser(){
        if(BROWSER.equalsIgnoreCase("firefox"))
        {
            FirefoxDriverManager.getInstance().setup();
            driver=new FirefoxDriver();
        }
        else  if(BROWSER.equalsIgnoreCase("chrome"))
        {
            ChromeDriverManager.getInstance().setup();
            driver=new ChromeDriver();
        }
        else  if(BROWSER.equalsIgnoreCase("IE"))
        {
            InternetExplorerDriverManager.getInstance().setup();
            driver=new InternetExplorerDriver();
        }
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    public void closeBrowser(){

       driver.quit();

    }
}
