package utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass extends CommonUtilities{

    String myBrowser;
    String myURL;
    public WebDriver driver ;

    public void loadProperties() throws IOException {
        FileInputStream fs = new FileInputStream(globalPath); // connect with the global properties file

        Properties prop = new Properties(); //

        prop.load(fs);


        String myBrowser = prop.getProperty("browser");
        String myURL = prop.getProperty("url");

        System.out.println(myBrowser);
        System.out.println(myURL);

        this.myBrowser = myBrowser;
        this.myURL = myURL;



    }
    public void lunchBrowser(){
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);

        if(myBrowser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
         else if (myBrowser.equalsIgnoreCase("fireFox")) {
             driver = new FirefoxDriver();

        }
         else {
            System.out.println("check your browser's path");
        }

         driver.get(myURL);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);


    }


//    public static void main(String[] args) throws IOException {
//        BaseClass obj = new BaseClass();
//        obj.loadProperties();
//        obj.lunchBrowser();
//
//    }


}
