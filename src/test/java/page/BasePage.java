package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void click(WebElement element) {
        waitVisibility(element);
        element.click();
    }

    protected boolean isElementDisplayed(WebElement element) {
        waitVisibility(element);
        return element.isDisplayed();
    }

    protected void fillField(WebElement element, String value) {
        waitVisibility(element);
        element.sendKeys(value);
    }
}
