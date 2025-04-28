package pages;

import baseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;
import java.util.List;
import java.util.NoSuchElementException;

public class ResultsPage extends BasePage {
    public ResultsPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnVideoByIndex() {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@id='dismissible']/descendant::ytd-thumbnail"), 5));
        List<WebElement> videos = driver.findElements(By.xpath("//div[@id='dismissible']/descendant::ytd-thumbnail"));

        if (videos.size() >= 4) {
            WebElement fourthVideo = videos.get(3); // Індекс 3 = 4-те відео

            try {
                WebElement icon = fourthVideo.findElement(By.xpath("//div[contains(@id,'channel-info')]/ytd-channel-name"));

                if (icon.isDisplayed()) {
                    System.out.println("Іконка знайдена, клікаємо на відео.");
                    fourthVideo.click();
                } else {
                    throw new RuntimeException("Іконка не відображається біля 4-го відео!");
                }

            } catch (NoSuchElementException e) {
                throw new RuntimeException("Іконка не знайдена біля 4-го відео!");
            }

        } else {
            throw new RuntimeException("Менше ніж 4 відео у результатах!");
        }
    }
}