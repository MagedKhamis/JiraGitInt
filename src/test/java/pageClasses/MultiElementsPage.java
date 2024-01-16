package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MultiElementsPage {
    WebDriver driver;

    public MultiElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@class = 'nav-link cstm-btn deskvw  ml-2']")
    WebElement signUp;

    public void multiElementsMethod() throws InterruptedException {
        signUp.click();
        Thread.sleep(4000);

        List <WebElement> multi = driver.findElements(By.tagName("input"));


        int numberOfElements = multi.size();
        System.out.println(numberOfElements);

        multi.get(0).sendKeys("Majed");
        multi.get(1).sendKeys("maj@gmail.com");
        multi.get(2).sendKeys("majed@123");

    }
}
