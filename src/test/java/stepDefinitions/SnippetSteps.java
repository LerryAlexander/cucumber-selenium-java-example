package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignInPage;
import pages.SnippetPage;
import utilities.Constants;
import utilities.Hooks;
import static org.junit.Assert.*;

public class SnippetSteps extends BaseSteps{

    private HomePage homePage;
    private SignInPage signInPage;
    private SnippetPage snippetPage;
    private String username;
    private String password;
    private String expectedSnippetText;

    public SnippetSteps(Hooks hooks) {
        super(hooks);
        homePage = new HomePage(hooks.getDriver());
        signInPage = new SignInPage(hooks.getDriver());
        snippetPage = new SnippetPage(hooks.getDriver());
    }

    @Given("I am logged in on Gruyure Web App with {string} and {string}")
    public void i_am_logged_in_on_Gruyure_Web_App_with_and(String username, String password) {
        this.username = username; this.password = password;
        driver.get(Constants.BASE_URL);
        homePage.getSignInElement().click();
        assertTrue("Error: Couldn't be able to complete login action", signInPage.loginAction(username, password));
    }

    @When("I fill up textarea with {string}")
    public void i_fill_up_textarea_with(String snippetText) {
        expectedSnippetText = snippetText;
        homePage.getNewSnippetsElement().click();
        assertEquals("\"Gruyure: New Snippet\" title is not present", Constants.EXPECTED_NEW_SNIPPED_TITLE, snippetPage.getNewSnippetTitle());
        snippetPage.getSnippetTextBox().sendKeys(snippetText);
    }

    @When("I click on Submit")
    public void i_click_on_Submit() {
        snippetPage.getSubmitButton().click();
    }

    @Then("I see my Snippet has been created successfully")
    public void i_see_my_Snippet_has_been_created_successfully() {
        assertEquals("Error: Snippet was not created", expectedSnippetText, snippetPage.getLastSnippetText());
    }

    @When("I delete my last snippet by clicking on X")
    public void i_delete_my_last_snippet_by_clicking_on_X() {
        snippetPage.getXLastSnippet().click();
    }

    @Then("I see my Snippet has been deleted successfully")
    public void i_see_my_Snippet_has_been_deleted_successfully() {
        assertFalse("Error: Last Snippet was not successfully deleted", snippetPage.isPresentLastSnippedText());
    }

    @When("I sign out and go back to sign in")
    public void i_sign_out_and_go_back_to_sign_in() {
        homePage.getSignOutElement().click();
        homePage.getSignInElement().click();
        assertTrue("Error: Couldn't be able to complete login action", signInPage.loginAction(username, password));
    }

    @When("I click on My Snippets")
    public void i_click_on_My_Snippets() {
        homePage.getMySnippetsElement().click();
    }


}
