package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
    WebDriver driver;

    public void dropdown(WebDriver driver){
        this.driver = driver;


    }
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstNamePath;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastNamePath;


    @FindBy(xpath = "//input[@name='reg_email__']")
    WebElement emailPath;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordPath;

    @FindBy(xpath = "//select[@name='birthday_month']")
    WebElement monthPath;

    @FindBy(xpath = "//select[@name='birthday_day']")
    WebElement dayPath;

    @FindBy(xpath = "//select[@name='birthday_year']")
    WebElement yearPath;





    public void firstName(){
        firstNamePath.sendKeys("Majed");
    }
    public void lastNmae(){
        lastNamePath.sendKeys("Farid");
    }
    public void email(){
        emailPath.sendKeys("mm@gmail.com");
    }
    public void password(){
        passwordPath.sendKeys("Majed@123");
    }
    public void selectMonth(){ //select by visible text / by index / by value
        Select dropDown1 = new Select(monthPath);
        dropDown1.selectByVisibleText("Jul");
    }

    public void selectDay(){
        Select dropDown2 = new Select(dayPath);
        dropDown2.selectByIndex(9);
    }
    public void selectYear(){
        Select dropDown3 = new Select(yearPath);
        dropDown3.selectByValue("1992");
    }


}
