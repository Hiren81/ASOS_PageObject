package baseTest_Utility;

import baseMain_Utility.Base_Main;
import org.junit.After;
import org.junit.Before;

public class Driver_Factory {
   Base_Main baseMain=new Base_Main();
@Before
    public void setUp(){
        baseMain.openBrowser();
    }
@After
    public void tearDown(){

      baseMain.closeBrowser();

    }
}
