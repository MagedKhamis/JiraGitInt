package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;

public class IFrameMouseEvent {
    WebDriver driver ;

    public IFrameMouseEvent(WebDriver driver) {
        this.driver = driver;

    }
    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginText;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordPath;




    public void doubleClick() throws InterruptedException {
        Actions click = new Actions(driver);
        click.moveToElement(loginText).build().perform();
        Thread.sleep(3000);
        click.doubleClick(loginText).build().perform();
        Thread.sleep(3000);


    }

//    public void rightClick(){
//        List<WebElement> multi = driver.findElements(By.tagName("input"));
//        Actions right = new Actions(driver);
//        right.contextClick(multi.get(0)).build().perform();
//
//
//    }
    public void righTwo(){
        Actions rCLick = new Actions(driver);
        rCLick.contextClick(passwordPath).build().perform();

    }



}
