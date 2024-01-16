package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageClasses.FacebookDropdown;

public class Facebooktest extends Appinitialization {

    FacebookDropdown facebookDropdown;
    @Test
    public void dropdownmethod() throws InterruptedException {
        facebookDropdown = PageFactory.initElements(driver , FacebookDropdown.class);

        facebookDropdown.firstName();
        facebookDropdown.lastNmae();
        facebookDropdown.email();
        facebookDropdown.password();
        Thread.sleep(3000);
        facebookDropdown.selectMonth();
        Thread.sleep(3000);
        facebookDropdown.selectDay();
        Thread.sleep(3000);
        facebookDropdown.selectYear();
    }
}
