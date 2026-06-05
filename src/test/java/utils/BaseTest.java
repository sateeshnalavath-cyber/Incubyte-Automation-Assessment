package utils;

import com.microsoft.playwright.*;

public class BaseTest {

    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    public static void launchBrowser() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        page = browser.newPage();

        page.navigate("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }

    public static void closeBrowser() {

        browser.close();
        playwright.close();
    }
}