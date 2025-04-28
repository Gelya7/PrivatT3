package pages;

import baseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ChannelPage extends BasePage {
    private final String SUBSCRIBE_BUTTON = "//div[@class='yt-flexible-actions-view-model-wiz__action']";
    private final String SIGN_IN_BUTTON = "//yt-button-shape[@class='style-scope ytd-popup-container']";
    private final String DISMISS_BUTTON = "//yt-button-renderer[@id='dismiss-button']";
    public ChannelPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnSubscribe() {
        // чекаємо кілька секунд чи з'явилась модалка і закриваємо
        if (isElementPresent(By.xpath(DISMISS_BUTTON), 3)) {  // 3 секунди чекати
            clickOnVisibilityOfElementLocatedByXpath(DISMISS_BUTTON);
        }
        // після закриття модалки клікаємо підписатися
        clickOnVisibilityOfElementLocatedByXpath(SUBSCRIBE_BUTTON);
    }

    private boolean isElementPresent(By locator, int timeoutInSeconds) {
        try {
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            return shortWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (Exception e) {
            return false; // якщо елемента немає, просто повертаємо false
        }
    }

//    public void clickOnSubscribe() {
//        if (isElementDisplayed(By.xpath("//yt-button-renderer[@id='dismiss-button']"))) {
//            clickOnVisibilityOfElementLocatedByXpath("//yt-button-renderer[@id='dismiss-button']");
//        }
//        clickOnVisibilityOfElementLocatedByXpath(SUBSCRIBE_BUTTON);
//    }
//
//    private boolean isElementDisplayed(By xpath) {
//        return false;
//    }

    public boolean isSignInVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGN_IN_BUTTON))).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }
}