package pages;
import baseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ResultsPage extends BasePage {
    public ResultsPage(WebDriver driver) {
        super(driver);
    }
    private final String VIDEO_LIST = "//ytd-thumbnail[@class='style-scope ytd-video-renderer']";
    private final String NAME_VIDEO = "//yt-formatted-string[contains(@class, 'ytd-video-renderer')]";

    public void clickOnVideoByIndex(int index) {





        // цей двіж треба обробить іф-ом
        // бо якщо це не відео а посилання на інший сайт то тест відпрацьоватиме не вірно
        // тому потрібно його переривати з відповідним ексепшеном,
        // типу на 4-му місці не відео а посилання на інший ресур


//        if ()
//
        try {
            clickOnElementByIndex(VIDEO_LIST, index);
       } catch (Exception e) {
           throw new RuntimeException("Помилка при кліку на відео за індексом " + index, e);
      }
    }

    }