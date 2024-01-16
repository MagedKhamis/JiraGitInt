package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseHoverOverPage {
    WebDriver driver;

    public MouseHoverOverPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@id='ui-id-4']")
    WebElement electronicsPath;

    public void electronicsHooverOver(){
        driver.switchTo().frame(0);

        Actions myAction = new Actions(driver);
        myAction.moveToElement(electronicsPath).build().perform();
        //new Actions(driver).moveToElement(electronicsPath).build().perform();

    }
}
