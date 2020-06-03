package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    protected WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="/html/body/div[2]/h2") WebElement signInTitle;
    @FindBy(name = "uid") WebElement usernameText;
    @FindBy(name = "pw") WebElement passwordText;
    @FindBy(className = "menu-user") WebElement menuUser;
    @FindBy(xpath ="/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input") WebElement loginButton;

    public String getSignInTitle() {
        return signInTitle.getText();
    }

    public void fillUpCredentials(String username, String password){
        usernameText.sendKeys(username);
        passwordText.sendKeys(password);
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public boolean isMenuUserPresent(){
        return menuUser.isDisplayed();
    }

    public boolean loginAction(String username, String password){
        fillUpCredentials(username, password);
        loginButton.click();
        return isMenuUserPresent();
    }
}
