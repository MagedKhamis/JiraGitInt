package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageClasses.FramePage;

public class FrameTest extends Appinitialization {
    FramePage framePage;
    @Test
    public void validateFrame() throws InterruptedException {
        framePage = PageFactory.initElements(driver,FramePage.class);
        framePage.frame();


    }
}
