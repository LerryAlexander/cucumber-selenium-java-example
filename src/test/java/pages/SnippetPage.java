package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SnippetPage {

    protected WebDriver driver;

    public SnippetPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="/html/body/h2") WebElement newSnippetTitle;
    @FindBy(name ="snippet") WebElement snippetTextBox;
    @FindBy(xpath ="/html/body/div[2]/div/form/table/tbody/tr/td[2]/input") WebElement submitButton;
    @FindBy(id ="0") WebElement LastSnippetText;
    @FindBy(xpath ="/html/body/div[2]/div[2]/table/tbody/tr[2]/td[2]/a") WebElement XLastSnippet;
    @FindBy(className = "content") WebElement snippetContentElement;

    public String getNewSnippetTitle() {
        return newSnippetTitle.getText();
    }

    public WebElement getSnippetTextBox() {
        return snippetTextBox;
    }

    public WebElement getSubmitButton(){
        return submitButton;
    }

    public String getLastSnippetText() {
        return LastSnippetText.getText();
    }

    public WebElement getXLastSnippet() {
        return XLastSnippet;
    }

    public boolean isPresentLastSnippedText(){
        try{
            return LastSnippetText.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}
