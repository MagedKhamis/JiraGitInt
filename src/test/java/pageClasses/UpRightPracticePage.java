package pageClasses;

import appinit.Appinitialization;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class UpRightPracticePage {
    WebDriver driver;

    public UpRightPracticePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='fav_language'and @value='radio1']")
    public WebElement radio1Path;

    public boolean radio1Selection() throws InterruptedException {
//      boolean radioselection =   radio1Path.isSelected();
//        System.out.println(radioselection);
//
//        Thread.sleep(3000);
//        radio1Path.click();
//
//        boolean radioselection2 =   radio1Path.isSelected();
//        System.out.println(radioselection2);

        boolean radioselection = radio1Path.isSelected();
        return radioselection;

    }

    @FindBy(xpath = "//input[@id='vehicle2']")
   public  WebElement car2Path;

    public Boolean checkBoxMethod() {

        Boolean car2Selection = car2Path.isSelected();
        return car2Selection;



    }

    @FindBy(xpath = "//button[text()='Mouse Hover']")
    public  WebElement mouseHooveroverPath;

    public void mouseHooverOver() throws InterruptedException {
        Thread.sleep(3000);
        Actions mouse = new Actions(driver);
        mouse.moveToElement(mouseHooveroverPath).build().perform();
    }

    @FindBy(xpath = "//button[text()='Try it']")
    WebElement alertPath;

    public void alertMethod() throws InterruptedException {
        alertPath.click();
        Thread.sleep(3000);


        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
    }

    @FindBy(xpath = "//button[text()='Open Window']")
    WebElement newWindowPath;



    public void newWindowMethod() throws InterruptedException {
        String firstWindow = driver.getWindowHandle();
        System.out.println(firstWindow);

        Thread.sleep(3000);
        newWindowPath.click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);

        for (String m : windows)
            if (m != firstWindow) {
                driver.switchTo().window(m);

            }
        String secndWindowText = driver.findElement(By.xpath("//h2[text()='Our Courses']")).getText();
        Assert.assertEquals(secndWindowText, "Our Courses");

        Thread.sleep(4000);


        driver.switchTo().window(firstWindow);
        String firstText = driver.findElement(By.xpath("//h1[text()='Upright Solutions Practice Page']")).getText();
        Assert.assertEquals(firstText, "Upright Solutions Practice Page");
    }
    @FindBy(xpath = "//button[text()='Click It']")
    WebElement displayPath;
    @FindBy(xpath = "//p[text()='UpRight']")
    WebElement upRightxPath;

        public void displayMethod () throws InterruptedException {

            displayPath.click();
            Thread.sleep(2000);
        if (upRightxPath.isDisplayed()){
            System.out.println("The element is displayed");
        }else
            {
                System.out.println("The element is not displayed");
            }


        }


        @FindBy(xpath = "//a[@class='nav-link cstm-btn deskvw  ml-2']")
    WebElement signUpFramePath;

        @FindBy(xpath = "//p[text()='Iframe Example']")
        WebElement iFramePath;

        @FindBy(xpath = "//h1[text()='Upright Solutions Practice Page']")
        WebElement upRighttextPath;

        @FindBy(xpath = "//h2[contains(text(),'Please')]")
        WebElement frameTextPath;

        @FindBy(xpath = "//input[@id='user_nameD']")
        WebElement enterUserNamePath;

public void iFrameMethod() throws InterruptedException {
    SoftAssert soft = new SoftAssert();
    driver.switchTo().frame(0);
    // what is iframe? how to identify an iframe?
    Thread.sleep(3000);
    signUpFramePath.click();

    String signUPText = frameTextPath.getText();

    soft.assertEquals(signUPText,"New User! Please sign up and start learning");
//    Thread.sleep(3000);
//    new Actions(driver).click(enterUserNamePath).keyDown(Keys.SHIFT).sendKeys("majed")
//            .keyUp(Keys.SHIFT).build().perform();



    Thread.sleep(3000);
    driver.switchTo().defaultContent();

    //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    String mainPageText = upRighttextPath.getText();

    soft.assertEquals(mainPageText,"Upright Solutions Practice Page");

    System.out.println(mainPageText);
// kill the snake but you dont want to break the stick

    soft.assertAll();

}

@FindBy(xpath = "//input[@id='html']")
    WebElement radioButtons;

public void multiButtons() throws InterruptedException {
    List <WebElement> buttons = driver.findElements(By.xpath("//input[@id='html']"));
    buttons.get(0).click();

    Thread.sleep(3000);
    buttons.get(1).click();

    Thread.sleep(3000);
    buttons.get(2).click();

    Thread.sleep(4000);

    new Actions(driver).sendKeys(Keys.PAGE_DOWN).pause(2000).sendKeys(Keys.PAGE_UP).build().perform();


}

public void jsExcuterHight() throws InterruptedException {
    Thread.sleep(3000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,200)");
}

public void jsScrollToView() throws InterruptedException {


    Thread.sleep(3000);
   // view.get(4).isDisplayed();
    driver.switchTo().frame(0);
    Thread.sleep(3000);

    WebElement view = driver.findElement(By.xpath("//a[@class='nav-link mr-2 deskvw']"));

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", view);
}
//public void takeScreenShot(String fileName){
//    TakesScreenshot ss = (TakesScreenshot) driver;
//    File memLocation = ss.getScreenshotAs(OutputType.FILE);
//    FileHandler.copy(memLocation,new File(sceenshotDirectory+fileName));
//
//}





}

