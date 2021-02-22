package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLettersPage extends BasePage {

    @FindBy(className = "ico ico_16-search ico_size_s")
    private WebElement search;

    public SearchLettersPage(WebDriver driver) {
        super(driver);
    }

    public void inputSearch(String dataFrom) {
        search.sendKeys("from: " + dataFrom + Keys.ENTER);
    }

    public void clickOnSearch() {
        click(search);
    }
}
