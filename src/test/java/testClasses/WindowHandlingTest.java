package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageClasses.WindowHandlingDemo;

public class WindowHandlingTest extends Appinitialization {
    WindowHandlingDemo windowHandlingDemo;

    @Test
    public void validateWindowHandling() throws InterruptedException {
        windowHandlingDemo= PageFactory.initElements(driver,WindowHandlingDemo.class );
        windowHandlingDemo.windowHandlingMethod();
    }
}
