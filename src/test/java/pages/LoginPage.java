package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void login() {

        page.locator("input[name='username']").fill(RegisterPage.username);

        page.locator("input[name='password']").fill(RegisterPage.password);

        page.locator("input[value='Log In']") .click();
    }
}