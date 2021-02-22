package page;

import io.qameta.allure.Step;
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

    @Step("Заполнение поля логин ")
    public void inputLogin(String login) {
        fillField(emailField, login);
    }

    @Step("Заполнение поля пароль")
    public void inputPasswd(String passwd) {
        fillField(passwdField, passwd);
    }

    @Step("Нажатие на кнопку ввода пароля")
    public void clickOnPasswrdBtn() {
        click(passwrdEntryBtn);
    }

    @Step("Нажатие на кнопку Ввести пароль")
    public void clickLoginBtn() {
        click(setPasswdBtn);
    }
}
