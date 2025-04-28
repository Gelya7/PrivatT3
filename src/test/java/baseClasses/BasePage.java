package baseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected WebElement visibilityOfElementLocatedByXpath(String locator) {
        return wait.until(visibilityOfElementLocated(By.xpath(locator)));
    }

    protected List<WebElement> visibilityOfElementsLocatedByXpath(String locator){
        wait.until(visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    protected void clickOnVisibilityOfElementLocatedByXpath(String locator) {
        visibilityOfElementLocatedByXpath(locator).click();
    }

    protected void clickOnElementByIndex(String locator, int index) {
        List<WebElement> elements = visibilityOfElementsLocatedByXpath(locator);

        if (index >= 0 && index < elements.size()) {
            elements.get(index).click();
        } else {
            throw new IndexOutOfBoundsException("Цей індекс не знайдено в листі елементів: " + index);
        }
    }
}
