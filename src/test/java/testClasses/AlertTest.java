package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.AlertPage;

public class AlertTest extends Appinitialization {
    AlertPage alertPage;
    @Test
    public void alertMethod() throws InterruptedException {
        alertPage = PageFactory.initElements(driver, AlertPage.class);
        alertPage.enterCustomerID();
        alertPage.submitButton();
    }

}
