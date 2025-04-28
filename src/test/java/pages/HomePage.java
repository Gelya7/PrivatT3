package pages;

import baseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final String INPUT_FIELD = "//input[@name='search_query']";
    private final String SUGGESTIONS_DROP_DOWN_MENU = "//div[@class='ytSuggestionComponentSuggestion ytSuggestionComponentSuggestionHover']";

    public WebElement searchInputField() {
        return visibilityOfElementLocatedByXpath(INPUT_FIELD);
    }

    public HomePage enterSearchQuery(String query) {
        searchInputField().sendKeys(query);
//        searchInputField().sendKeys(Keys.SPACE); // стимулюємо появу автопідказок
        return this;
    }

    public HomePage clickSuggestionFieldInDropDownMenuByIndex(int indexSuggestions) {
        clickOnElementByIndex(SUGGESTIONS_DROP_DOWN_MENU, indexSuggestions);
        return this;
    }
}
