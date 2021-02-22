package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    @Step("Ожидание видимости элемента")
    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @Step("Нажать")
    protected void click(WebElement element) {
        waitVisibility(element);
        element.click();
    }

    @Step("Заполнить поле")
    protected void fillField(WebElement element, String value) {
        waitVisibility(element);
        element.sendKeys(value);
    }
}
