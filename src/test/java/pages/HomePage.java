package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    protected WebDriver driver;

    @FindBy(className="has-refresh") WebElement homeTitle;
    @FindBy(xpath = "//*[@id=\"menu-right\"]/a[1]") WebElement signInElement;
    @FindBy(xpath = "//*[@id=\"menu-right\"]/a[2]") WebElement signUpElement;
    @FindBy(xpath = "//*[@id=\"menu-left\"]/a") WebElement homeElement;
    @FindBy(xpath = "//*[@id=\"menu-left\"]/a[2]") WebElement mySnippetsElement;
    @FindBy(xpath = "//*[@id=\"menu-left\"]/a[3]") WebElement newSnippetsElement;
    @FindBy(xpath = "//*[@id=\"menu-right\"]/a[2]") WebElement signOutElement;

    public HomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public String getHomeTitle() {
        return homeTitle.getText();
    }

    public WebElement getSignInElement() {
        return signInElement;
    }

    public WebElement getSignUpElement() {
        return signUpElement;
    }

    public WebElement getHomeElement() {
        return homeElement;
    }

    public WebElement getMySnippetsElement() {
        return mySnippetsElement;
    }

    public WebElement getNewSnippetsElement() { return newSnippetsElement; }

    public WebElement getSignOutElement() { return signOutElement; }

}
