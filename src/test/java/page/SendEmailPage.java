package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SendEmailPage extends BasePage {

    By formLocator = By.name("to");
    By subjectLocator = By.name("subjectbox");
    @FindBy(xpath = "//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/span/div[1]/div[1]/div/div/div/div[1]/div/div/a/span/span/svg")
    private WebElement writeLetterBtn;
    @FindBy(className = "text--1czzf")
    private WebElement to;
    @FindBy(className = "Subject")
    private WebElement subject;
    @FindBy(className = "cke_widget_wrapper cke_widget_block cke_widget_signature")
    private WebElement message;
    @FindBy(className = "button2__txt")
    private WebElement sendBtn;

    public SendEmailPage(WebDriver driver) {
        super(driver);
    }

    public void openForm() {
        writeLetterBtn.click();
        to.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(formLocator));
    }

    public void fillFieldTo(String dataTo) {
        fillField(to, dataTo);
    }

    public void openSubjectForm() {
        driver.findElement(subjectLocator);
    }

    public void fillSubject(String dataSubject) {
        fillField(subject, dataSubject);
    }

    public void fillMessageField() {
        driver.findElement(By.className("gmail_signature"))
                .findElement(By.xpath("../..")).findElement(By.cssSelector("[contenteditable=true]"));
    }

    public void makeMessage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String result = driver.findElements(By.cssSelector("span.Dj")).stream()
                .filter(WebElement::isDisplayed).findFirst().orElseThrow(() ->
                        new RuntimeException("no displayed element with search result"))
                .findElement(By.cssSelector("span.ts:last-child")).getText();
        ;
        js.executeScript("arguments[0].innerHTML=arguments[1] + arguments[0].innerHTML;", message,
                String.format(message, Integer.parseInt(result), dataFrom));

        subject.sendKeys(Keys.chord(Keys.LEFT_CONTROL, Keys.ENTER));
    }


}
