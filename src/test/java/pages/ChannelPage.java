package pages;

import baseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ChannelPage extends BasePage {
    private final String SUBSCRIBE_BUTTON = "//div[contains(@class, 'view-model-wiz__container')]";
    private final String SIGN_IN_BUTTON = "//yt-button-shape[@class='style-scope ytd-popup-container']";

    public ChannelPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSubscribe() {
        if (isElementDisplayed(By.xpath("//div/yt-button-renderer[@id='dismiss-button']"))) {
            clickOnVisibilityOfElementLocatedByXpath("//div/yt-button-renderer[@id='dismiss-button']");
        }
        clickOnVisibilityOfElementLocatedByXpath(SUBSCRIBE_BUTTON);
    }

    private boolean isElementDisplayed(By xpath) {
        return false;
    }

    public boolean isSignInVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGN_IN_BUTTON))).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }
}