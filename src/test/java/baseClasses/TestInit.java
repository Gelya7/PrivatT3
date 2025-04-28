package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestInit {
    protected static WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown () {
        if (driver != null) {
            driver.quit();
        }
    }

}
