package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpRightPage {
    WebDriver driver;

    public UpRightPage(WebDriver driver)  {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@class = 'nav-link cstm-btn deskvw  ml-2']")
    WebElement signUp;

    @FindBy(xpath = "//button[@id = 'Submit123']")
    WebElement registerButton ;


    public void clickOnSignUpButton(){
        signUp.click();
    }
    public String getText(){
        String myText = registerButton.getText();
        return myText;

    }

    public void clickOnRegisterButton(){
        registerButton.click();
    }



}

