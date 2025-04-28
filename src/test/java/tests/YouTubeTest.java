package tests;

import baseClasses.TestInit;
import org.testng.annotations.Test;
import pages.ChannelPage;
import pages.HomePage;
import pages.ResultsPage;
import pages.VideoPage;

import static helpers.BrowserActions.*;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utills.RandomValue.generateRandomDigits;


public class YouTubeTest extends TestInit {

    @Test
    public void testFullScenario() throws InterruptedException {

        String expTitleHomePage = "YouTube";
        int fourSymbols = 4;
        int secondSuggestionField = 1;

        HomePage homePage = new HomePage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        VideoPage videoPage = new VideoPage(driver);
        ChannelPage channelPage = new ChannelPage(driver);

        openBaseUrl();
        assertEquals(getTitle(), expTitleHomePage);

        homePage.enterSearchQuery(generateRandomDigits(fourSymbols));
        maximizeWindow();
        homePage.clickSuggestionFieldInDropDownMenuByIndex(secondSuggestionField);

        resultsPage.clickOnVideoByIndex();
        videoPage.clickOnAuthorAvatar();
        sleep(10000);
        channelPage.clickOnSubscribe();

        assertTrue(channelPage.isSignInVisible(), "Не відображено текст 'Войти'.");

    }
    }

