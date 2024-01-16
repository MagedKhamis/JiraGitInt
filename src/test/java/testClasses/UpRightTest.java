package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageClasses.UpRightPage;

import java.io.IOException;

public class UpRightTest extends Appinitialization {
    UpRightPage upRightPage;

    @Test
    public void validatePage() throws IOException {
        upRightPage= PageFactory.initElements(driver , UpRightPage.class);
//        SoftAssert soft = new SoftAssert();
//        soft.assertEquals(myText, "REGISTER");

        upRightPage.clickOnSignUpButton();
        String newText = upRightPage.getText();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(newText, "REGISTER");
        upRightPage.clickOnRegisterButton();
        screenShot("Majed.png");

    }

}
