package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CommonUtilities {
    WebDriver driver ;

    String currentDirectory = new File(System.getProperty("user.dir")).getAbsolutePath();

    String chromeDriverPath = currentDirectory+File.separator+ "src" + File.separator + "test" + File.separator
            +"Drivers"+File.separator+"chromedriver.exe";

    String geckoDriverPath = currentDirectory+File.separator+ "src" + File.separator + "test" + File.separator
            +"Drivers"+File.separator+"geckodriver.exe";

    String globalPath = currentDirectory+File.separator+ "src" + File.separator + "test" + File.separator +"properties"
            +File.separator+"global.properties";

    String externalDataPath = currentDirectory+File.separator+ "src" + File.separator + "test" + File.separator +
            "externalData";

    String extendedReportPath =  currentDirectory+File.separator+ "src" + File.separator + "test" + File.separator +
            "extendedReport";

    public String screenShotPath = currentDirectory+File.separator+ "src" + File.separator + "test"
            +File.separator+ "ScreenShotFolder"+File.separator;


//    public void screenShotMethod(String fileName) throws IOException {
//        TakesScreenshot ss = (TakesScreenshot) driver;
//        File memoryLocationn = ss.getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(memoryLocationn , new File(screenShotPath + fileName));
//    }

    public void screenShot(String fileName) throws IOException {
        TakesScreenshot ss = (TakesScreenshot) driver; // type casting
        File MemoryLocation = ss.getScreenshotAs(OutputType.FILE); //it will take the screenshot and keep it in
        FileHandler.copy(MemoryLocation , new File(screenShotPath+fileName));

    }


//    public static void main(String[] args) throws IOException {
//        CommonUtilities obj = new CommonUtilities();
//        System.out.println(obj.currentDirectory);
//        System.out.println(obj.chromeDriverPath);
//        System.out.println(obj.geckoDriverPath);
//        System.out.println(obj.globalPath);
//        System.out.println(obj.externalDataPath);
//        System.out.println(obj.extendedReportPath);
//        System.out.println(obj.screenShotPath);








   // }
}
