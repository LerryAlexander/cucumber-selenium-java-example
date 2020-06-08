package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    protected WebDriver driver;

    @Before
    public void initDriver() throws Exception {
        switch (System.getProperty("os").toLowerCase()) {
            case "linux":
                System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_LINUX_EXECUTABLE_PATH);
                break;
            case "osx":
                System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_MAC_EXECUTABLE_PATH);
                break;
            default:
                throw new Exception("No OS specified, please run test with the following format specifying whether your system is " +
                                    "linux or osx: './gradlew test -Dos=your_OS_here'");
        }
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
