package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Platform;
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

        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("chrome");

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
//
//        driver = new ChromeDriver();

        try {
            driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("https://mail.ru/");
    }

    @AfterClass
    public static void cleanUp() {
        if (driver != null)
            driver.quit();
    }
}
