package pageObject.Television;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelevisionPage {

    public static WebDriver driver;

    public TelevisionPage( WebDriver driver){
        PageFactory.initElements(driver, this);
        TelevisionPage.driver = driver;
    }

    @FindBy(id = "nav-logo-sprites")
    private WebElement logoAmazonHome;
    public boolean verifyHomePage(){
        logoAmazonHome.isDisplayed();
        return true;
    }


    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    private WebElement hamburgerMenuButton;
    public void setHamburgerMenuButton(){
        hamburgerMenuButton.click();
    }

    @FindBy(xpath = "//span[@id='submit.add-to-cart']/span[@class='a-button-inner']")
    private WebElement addToCartButton;
    public void setAddToCartButton(){
        addToCartButton.click();
    }

    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    private WebElement buttonProccesToCheckout;
    public void setButtonProccesToCheckout(){
        buttonProccesToCheckout.click();
    }

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement inputName;
    public void setInputName(String userName){
        inputName.sendKeys(userName);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;
    public void setButtonContinue(){
        buttonContinue.click();
    }

    @FindBy(xpath = "//span[@class='a-list-item']")
    private WebElement errorMessage;
    public String setErrorMessage(){
        return errorMessage.getText();
    }


}
