package stepDefinitions;

import io.cucumber.java.en.When;
import pages.SignInPage;
import utilities.Hooks;

public class SignInSteps extends BaseSteps{

    private SignInPage signInPage;

    public SignInSteps(Hooks hooks) {
        super(hooks);
        signInPage = new SignInPage(hooks.getDriver());
    }

    @When("I fill up {string} and {string} with an existing account")
    public void i_fill_up_and_with_an_existing_account(String username, String password) {
        signInPage.fillUpCredentials(username, password);
        signInPage.getLoginButton().click();
    }
}
