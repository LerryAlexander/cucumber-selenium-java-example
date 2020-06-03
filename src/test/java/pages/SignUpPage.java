package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    protected WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="/html/body/div[2]/h3") WebElement signUpTitle;
    @FindBy(name = "uid") WebElement usernameText;
    @FindBy(name = "pw") WebElement passwordText;
    @FindBy(xpath ="/html/body/div[2]/form/table/tbody/tr[3]/td[2]/input") WebElement createAccountButton;
    @FindBy(className = "Account created.") WebElement signUpMessage;
    @FindBy(className = "menu-user") WebElement menuUser;

    public String getSignUpTitle() {
        return signUpTitle.getText();
    }

    public WebElement getUsernameText() {
        return usernameText;
    }

    public WebElement getPasswordText() {
        return passwordText;
    }

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public void fillUpCredentials(String username, String password){
        usernameText.sendKeys(username);
        passwordText.sendKeys(password);
    }

    public boolean isMenuUserPresent(){
        return menuUser.isDisplayed();
    }
}
