package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.HomePage;
import static org.junit.Assert.*;

import utilities.Constants;
import utilities.Hooks;

public class SignOutSteps extends BaseSteps{

    private HomePage homePage;

    public SignOutSteps(Hooks hooks){
        super(hooks);
        homePage = new HomePage(hooks.getDriver());
    }

    @Then("I am logged out successfully")
    public void i_am_logged_out_successfully() {
        assertEquals("Error during sign out: \"Gruyure: Home\" title is not present", Constants.EXPECTED_HOME_TITLE, homePage.getHomeTitle());
    }
}
