package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    protected WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_EXECUTABLE_PATH);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver(){
        return driver;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }
}
