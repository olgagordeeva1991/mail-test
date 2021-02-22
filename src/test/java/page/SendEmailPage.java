package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendEmailPage extends BasePage {

    @FindBy(css = ".compose-button__txt")
    private WebElement writeLetterBtn;

    @FindBy(css = "[data-type=\"to\"] input")
    private WebElement toField;

    @FindBy(css = "[name=\"Subject\"]")
    private WebElement subjectField;

    @FindBy(css = ".compose-app__compose [role=\"textbox\"] div:nth-child(1)")
    private WebElement messageField;

    @FindBy(xpath = "//*[text()='Отправить']")
    private WebElement sendBtn;

    public SendEmailPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие бланка письма")
    public void openForm() {
        click(writeLetterBtn);
    }

    @Step("Заполнение поля адресата")
    public void fillFieldTo(String dataTo) {
        fillField(toField, dataTo);
    }

    @Step("Заполнение поля Тема письма")
    public void fillSubject(String dataSubject) {
        fillField(subjectField, dataSubject);
    }

    @Step("Заполнение поля текст письма")
    public void fillMessageField(String dataMessage) {
        fillField(messageField, dataMessage);
    }

    @Step("Нажатие кнопки Отправить")
    public void clickSendBtn() {
        sendBtn.click();
    }
}
