import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    //Elements
    @FindBy(css = "#user-name")
    WebElement userNameField;
    @FindBy(css = "#password")
    WebElement passwordField;
    @FindBy(css = "#login-button")
    WebElement loginButton;
    @FindBy(xpath = "//h3")
    WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickLogin(){
        clickElement(loginButton);
    }
    public void fillUserName(String username){
        fillText(userNameField, username);
    }
    public void fillPassword(String password){
        fillText(passwordField, password);
    }
    public String getError(){
        return (getElementText(error));
    }
}
