package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utilities.Hooks;

public abstract class BaseSteps {

    WebDriver driver;

    public BaseSteps(Hooks hooks){
        this.driver = hooks.getDriver();

    }
}
