package pages;
import baseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;


public class VideoPage extends BasePage {

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    private final String AUTHOR_AVATAR = "//div[@id='owner']//yt-img-shadow[@id='avatar']";
    private final String REELS_AVATAR ="//div[@class='yt-spec-avatar-shape--avatar-size-small']";

    public void clickOnAuthorAvatar() {
        if (isElementPresent(By.xpath(REELS_AVATAR))) {
            clickOnVisibilityOfElementLocatedByXpath(REELS_AVATAR);
        } else if (isElementPresent(By.xpath(AUTHOR_AVATAR))) {
            clickOnVisibilityOfElementLocatedByXpath(AUTHOR_AVATAR);
        } else {
            throw new RuntimeException("Не знайдено ані аватара Reels, ані стандартного автора відео. Неможливо продовжити тест.");
        }
    }

    private boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }
}
