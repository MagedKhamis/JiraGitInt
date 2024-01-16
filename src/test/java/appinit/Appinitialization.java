package appinit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utility.BaseClass;

import java.io.IOException;

public class Appinitialization extends BaseClass {

    @BeforeMethod
    public void openningApp() throws IOException {
        loadProperties();
        lunchBrowser();

    }
}
