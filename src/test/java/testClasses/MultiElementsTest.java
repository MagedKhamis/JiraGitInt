package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageClasses.MultiElementsPage;

public class MultiElementsTest extends Appinitialization {
    MultiElementsPage hoverOverPageClass;
    @Test
    public void validateMulti() throws InterruptedException {
        hoverOverPageClass = PageFactory.initElements(driver, MultiElementsPage.class);
        hoverOverPageClass.multiElementsMethod();
    }
}
