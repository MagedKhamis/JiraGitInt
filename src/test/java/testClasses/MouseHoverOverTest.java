package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageClasses.MouseHoverOverPage;

public class MouseHoverOverTest extends Appinitialization {
    MouseHoverOverPage mouseHoverOverPage;
    @Test
    public void validateHooverOver(){
         mouseHoverOverPage= PageFactory.initElements(driver, MouseHoverOverPage.class);
         mouseHoverOverPage.electronicsHooverOver();
    }
}
