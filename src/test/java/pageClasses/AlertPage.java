package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertPage {
    WebDriver driver;

    public AlertPage(WebDriver driver){
        this.driver= driver;
    }

    @FindBy(xpath = "//input[@name='cusid']")
    WebElement inputFieldPath;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitPath;

    public void enterCustomerID(){
        inputFieldPath.sendKeys("53920");
    }
    public void submitButton() throws InterruptedException {
        submitPath.click();

        String myText = driver.switchTo().alert().getText();
        //Assert.assertEquals(myText , "hi");
        System.out.println(myText);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        String my2ndText = driver.switchTo().alert().getText();
        System.out.println(my2ndText);
        driver.switchTo().alert().accept();
        System.out.println("Hello");
    }
}
