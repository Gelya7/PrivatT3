package helpers;

import baseClasses.TestInit;

import static utills.UrlsReader.getProperty;

public class BrowserActions extends TestInit {
    public static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public static void openUrl(String url) {
        driver.get(url);
    }

    public static void openBaseUrl() {
        openUrl(getProperty("base.url"));
    }

    public static String getTitle() {
        return driver.getTitle();
    }
}
