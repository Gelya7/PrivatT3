package pages;
import baseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VideoPage extends BasePage {

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    private final String AUTHOR_AVATAR = "//div[@id='owner']//yt-img-shadow[@id='avatar']";

    public void clickOnAuthorAvatar() {
        if (isElementDisplayed(By.xpath("yt-decorated-avatar-view-model[@class='yt-decorated-avatar-view-model-wiz']"))) {
            clickOnVisibilityOfElementLocatedByXpath("yt-decorated-avatar-view-model[@class='yt-decorated-avatar-view-model-wiz']");
        }
        clickOnVisibilityOfElementLocatedByXpath(AUTHOR_AVATAR);
    }

    private boolean isElementDisplayed(By xpath) {
        return false;
    }
}
