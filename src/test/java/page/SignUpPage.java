package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

    @FindBy(css = ".email-input")
    private WebElement emailField;

    @FindBy(css = "[data-testid=\"enter-password\"]")
    private WebElement setPasswdBtn;

    @FindBy(css = "[data-testid=\"password-input\"]")
    private WebElement passwdField;

    @FindBy(css = "[data-testid=\"login-to-mail\"]")
    private WebElement passwrdEntryBtn;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputLogin(String login) {
        fillField(emailField, login);
    }

    public void inputPasswd(String passwd) {
        fillField(passwdField, passwd);
    }

    public void clickOnPasswrdBtn() {
        click(passwrdEntryBtn);
    }

    public void clickLoginBtn() {
        click(setPasswdBtn);
    }
}
