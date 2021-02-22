package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://mail.ru/");
    }

    @AfterClass
    public static void cleanUp() {
        if (driver != null)
            driver.quit();
    }
}
