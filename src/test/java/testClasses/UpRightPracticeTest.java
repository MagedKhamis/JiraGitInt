package testClasses;

import appinit.Appinitialization;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageClasses.AlertPage;
import pageClasses.UpRightPracticePage;

import java.io.IOException;

public class UpRightPracticeTest extends Appinitialization {
    UpRightPracticePage upRightPracticePage;

    @Test
    public void validateRadioButton1() throws InterruptedException {
        upRightPracticePage= PageFactory.initElements(driver , UpRightPracticePage.class);

        if (upRightPracticePage.radio1Selection() == false){
            upRightPracticePage.radio1Path.click();
        }
        else {
            System.out.println("already selected");
        }

    }

    @Test
    public void checkBocValidation(){
        upRightPracticePage= PageFactory.initElements(driver , UpRightPracticePage.class);

        if( upRightPracticePage.checkBoxMethod()== true){
           System.out.println("Already Selected");

       }else{
           upRightPracticePage.car2Path.click();
       }
    }

    @Test
    public void mouseHooverO() throws InterruptedException {
        upRightPracticePage= PageFactory.initElements(driver , UpRightPracticePage.class);
        upRightPracticePage.mouseHooverOver();

    }
    @Test
    public void alertValidation() throws InterruptedException, IOException {
        upRightPracticePage= PageFactory.initElements(driver , UpRightPracticePage.class);
        upRightPracticePage.alertMethod();
        Thread.sleep(3000);
        screenShot("hhsdlsl.png");

    }
    @Test
    public void windowHandleValidation() throws InterruptedException {
        upRightPracticePage=PageFactory.initElements(driver, UpRightPracticePage.class);
        upRightPracticePage.newWindowMethod();
    }

    @Test
    public void iFrameValidation() throws InterruptedException {
        upRightPracticePage=PageFactory.initElements(driver, UpRightPracticePage.class);
        upRightPracticePage.iFrameMethod();
    }
    @Test
    public void multiRadioButtons() throws InterruptedException {
        upRightPracticePage=PageFactory.initElements(driver, UpRightPracticePage.class);
upRightPracticePage.multiButtons();
    }

    @Test
    public void jsExc() throws InterruptedException {
        upRightPracticePage=PageFactory.initElements(driver, UpRightPracticePage.class);
        upRightPracticePage.jsExcuterHight();

    }
    @Test
    public void scrollView() throws InterruptedException, IOException {
        upRightPracticePage=PageFactory.initElements(driver, UpRightPracticePage.class);
        upRightPracticePage.jsScrollToView();


    }






}
