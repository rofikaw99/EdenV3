package pageObject.Storage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StorageFeature {
    public static WebDriver driver;

    public StorageFeature(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    private WebElement mainMenButton;

    public void setMainMenButton() {
        mainMenButton.click();
    }

    @FindBy(id = "nav-logo-sprites")
    private WebElement aLandingPage;

    public boolean amazonLandingPage() {
        aLandingPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//span[@id='submit.add-to-cart']/span[@class='a-button-inner']")
    private WebElement addCart;

    public void setAddCart() {
        addCart.click();

    }

    @FindBy(id = "nav-cart")
    private WebElement clickCartA;

    public void setClickCartA() {
        clickCartA.click();

    }

    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    private WebElement buttonProccedToCheckout;

    public void setButtonProccedToCheckout() {
        buttonProccedToCheckout.click();
    }

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement aLoginPage;
    public boolean amazonLoginPage() {
        aLoginPage.isDisplayed();
        return true;
    }

}
