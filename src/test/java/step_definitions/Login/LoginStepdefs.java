package step_definitions.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.PET.LoginPage;
import step_definitions.Hooks;

public class LoginStepdefs {
    private static WebDriver webDriver;
    public LoginStepdefs(){
        super();
        webDriver = Hooks.webDriver;
    }
    @Given("User already on EdenFarm login page")
    public void userAlreadyonLoginPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.setVerifyHomePage());
        Thread.sleep(20000);
    }
    @When("^I input email \"([^\"]*)\" and password \"([^\"]*)\" in Eden$")
    public void iInputEmailAndPasswordInEden(String email, String password) throws InterruptedException {
        LoginPage edenPage = new LoginPage(webDriver);
        edenPage.setEmail(email);
        edenPage.setPassword(password);
        Thread.sleep(2000);
    }
    @And("User click on Button Continue")
    public void userClickOnButtonContinue() throws InterruptedException {
        LoginPage petPage = new LoginPage(webDriver);
        petPage.setButtonContinue();
        Thread.sleep(10000);
    }

    @Then("^Directedted to Home Page$")
    public void directedtedToHomePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.getHomePage());
        Thread.sleep(3000);
    }
}
