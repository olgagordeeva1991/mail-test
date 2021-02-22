package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        String runType = System.getenv("RUN_TYPE");
        if (runType.equals("remote")) {
            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setBrowserName("chrome");
            try {
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else if (runType.equals("local")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");

            driver = new ChromeDriver();

        }

        driver.get("https://mail.ru/");
    }

    @AfterClass
    public static void cleanUp() {
        if (driver != null)
            driver.quit();
    }
}
