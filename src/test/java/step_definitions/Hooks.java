package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver webDriver;
    @Before
    public void openBrowser() throws InterruptedException {
        ChromeOptions a = new ChromeOptions();
        a.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webDriver= new ChromeDriver(a);
        String URL = "https://v3-dashboard.edenfarm.tech";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
        Thread.sleep(7000);

    }
    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}

