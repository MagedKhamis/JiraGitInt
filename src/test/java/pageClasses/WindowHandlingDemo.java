package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class WindowHandlingDemo {
    WebDriver driver;

    public WindowHandlingDemo(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newWindowPath;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement samplePagePath;

    @FindBy(xpath = "//div[text()='Browser Windows']")
    WebElement browserWindowPath;

    public void windowHandlingMethod() throws InterruptedException {
        Thread.sleep(3000);
        newWindowPath.click();
        String firstWindowID = driver.getWindowHandle();
        System.out.println("First window ID is  " +firstWindowID);

        Set <String> multiWindowID = driver.getWindowHandles();
        System.out.println(multiWindowID);



        for(String m:multiWindowID) {
            if (m != firstWindowID) {
                driver.switchTo().window(m);
            }

        }
        Thread.sleep(3000);
        String samplePageText = samplePagePath.getText();
        System.out.println(samplePageText);

        driver.switchTo().window(firstWindowID);
        String firstPageText = browserWindowPath.getText();
        System.out.println(firstPageText);

        Thread.sleep(3000);
        driver.quit();
    }
}
