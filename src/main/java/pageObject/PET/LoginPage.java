package pageObject.PET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    // Logo Home Page Eden
    @FindBy(css = "img[data-v-b152bd60]")
    private WebElement logoEden;
    public boolean setVerifyHomePage(){
        logoEden.isDisplayed();
        return true;
    }
    @FindBy(css = "input[data-unq='login-input-email']")
    private WebElement usernameMail;
    public void setEmail(String email){
        usernameMail.sendKeys(email);
    }
    @FindBy(css = "input[data-unq='login-input-password']")
    private WebElement inputPassword;
    public void setPassword(String password){
        inputPassword.sendKeys(password);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;
    public void setButtonContinue(){
        buttonContinue.click();
    }
    // display error message
    @FindBy(xpath = "//span[@class='a-list-item']")
    private WebElement errorMessage;
    public String setErrorMessage(){
        return errorMessage.getText();
    }
}

