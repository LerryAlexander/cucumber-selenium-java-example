package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignInPage;
import pages.SignUpPage;
import pages.SnippetPage;
import utilities.Constants;
import utilities.Hooks;
import static org.junit.Assert.*;

public class SignUpSteps extends BaseSteps{

    private HomePage homePage;
    private SignUpPage signUpPage;
    private SignInPage signInPage;
    private SnippetPage snippetPage;

    public SignUpSteps(Hooks hooks) {
        super(hooks);
        homePage = new HomePage(hooks.getDriver());
        signUpPage = new SignUpPage(hooks.getDriver());
        signInPage = new SignInPage(hooks.getDriver());
        snippetPage = new SnippetPage(hooks.getDriver());
    }

    @Given("I am on the Gruyure Home web page")
    public void i_am_on_the_Gruyure_Home_web_page() {
        driver.get(Constants.BASE_URL);
        assertEquals("", Constants.EXPECTED_HOME_TITLE, homePage.getHomeTitle());
    }

    @When("I click on {string}")
    public void i_click_on(String clickOption) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        switch (clickOption){
            case "Sign Up":
                homePage.getSignUpElement().click();
                assertEquals("\"Sign Up\" title is not present", Constants.EXPECTED_SIGN_UP_TITLE, signUpPage.getSignUpTitle());
                break;
            case "Sign In":
                homePage.getSignInElement().click();
                assertEquals("\"Gruyere: Login\" title is not present", Constants.EXPECTED_SIGN_IN_TITLE, signInPage.getSignInTitle());
                break;
            case "New Snippet":
                homePage.getNewSnippetsElement().click();
                assertEquals("\"Gruyere: New Snippet\" title is not present", Constants.EXPECTED_NEW_SNIPPED_TITLE, snippetPage.getNewSnippetTitle());
                break;
            case "Sign Out":
                homePage.getSignOutElement().click();
                break;
            default:
                throw new Exception("Invalid menu option");
        }
    }

    @When("I fill up with a {string} and {string}")
    public void i_fill_up_with_a_and(String username, String password) {
        signUpPage.fillUpCredentials(username, password);
    }

    @When("I click on Create account")
    public void i_click_on_Create_account() {
        signUpPage.getCreateAccountButton().click();
    }

    @When("I click on Home")
    public void i_click_on_Home() {
        homePage.getHomeElement().click();
    }

    @Then("I am logged in successfully")
    public void i_am_logged_in_successfully() {
        assertTrue("Error on Sign Up Test: the menu user is not present", signUpPage.isMenuUserPresent());
    }

}
