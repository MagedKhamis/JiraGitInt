package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageClasses.IFrameMouseEvent;

public class IFrameMouseEventTest extends Appinitialization {
    IFrameMouseEvent iFrameMouseEvent;

    @Test
    public void validateMouseEvent() throws InterruptedException {
        iFrameMouseEvent = PageFactory.initElements(driver,IFrameMouseEvent.class);
        iFrameMouseEvent.doubleClick();
        Thread.sleep(3000);
        //iFrameMouseEvent.rightClick();
        iFrameMouseEvent.righTwo();
    }

}
