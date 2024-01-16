package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramePage {
    WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//frame[@name='packageListFrame']")
    WebElement frame1Path;

    @FindBy(xpath = "//frame[@name='packageFrame']")
    WebElement frame2Path;

    @FindBy(xpath = "//frame[@name='classFrame']")
    WebElement frame3Path;
    @FindBy(xpath = "//a[text()='java.awt.color'and @target ='packageFrame' ]")
    WebElement colorPackagePath;

    @FindBy(xpath = "//a[text()='ColorSpace'and @target ='classFrame' ]")
    WebElement colorSpacePath;

    @FindBy(xpath = "//h2[text()='Class ColorSpace']")
    WebElement colorSpaceTextPath;

    public void frame() throws InterruptedException {
        //driver.switchTo().frame(frame1Path);
        driver.switchTo().frame(0);
        colorPackagePath.click();
        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        //driver.switchTo().frame(frame2Path);
        driver.switchTo().frame(1);
        colorSpacePath.click();

        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        //driver.switchTo().frame(frame3Path);
        driver.switchTo().frame(2);
        String myText = colorSpaceTextPath.getText();
        System.out.println(myText);
        Assert.assertEquals(myText, "Class ColorSpace");
    }

}
