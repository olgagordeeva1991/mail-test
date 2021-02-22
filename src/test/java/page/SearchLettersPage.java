package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchLettersPage extends BasePage {

    @FindBy(css = ".r-search-panel input")
    private WebElement searchField;

    @FindBy(xpath = "//*[contains(@class, 'r-search-panel')]/*[normalize-space(text()) = 'Найти']")
    private WebElement searchBtn;

    @FindBy(css = ".search-panel .search-panel-button__text")
    private WebElement searchOnMailField;

    @FindBy(css = ".llc__container")
    private List<WebElement> letter;

    @FindBy(css = ".list-letter-preview-action__message")
    private WebElement letterPreviewMsg;


    public SearchLettersPage(WebDriver driver) {
        super(driver);
    }

    @Step("Заполнение поля поиска")
    public void inputSearchData(String dataFrom) {
        fillField(searchField, dataFrom);
    }

    @Step("Нажатие на кнопку поиск")
    public void clickOnSearchBtn() {
        click(searchBtn);
    }

    @Step("Нажатие на кнопку поиск по почте")
    public void clickOnSearchOnMailField() {
        click(searchOnMailField);
    }

    @Step("Подсчет количества найденных писем")
    public int countLetters() {
        waitVisibility(letterPreviewMsg);
        return letter.size();
    }
}
