package pages;

import com.microsoft.playwright.Page;

public class RegisterPage {

    Page page;

    public static String username = "user" + System.currentTimeMillis();

    public static String password = "Test@123";

    public RegisterPage(Page page) { this.page = page;
    }

    public void registerUser() {

        page.getByText("Register").click();

        page.locator("#customer\\.firstName") .fill("Sateesh");

        page.locator("#customer\\.lastName") .fill("Nalavath");

        page.locator("#customer\\.address\\.street").fill("Hyderabad");

        page.locator("#customer\\.address\\.city") .fill("Hyderabad");

        page.locator("#customer\\.address\\.state").fill("Telangana");

        page.locator("#customer\\.address\\.zipCode") .fill("500001");

        page.locator("#customer\\.phoneNumber").fill("9876543210");

        page.locator("#customer\\.ssn").fill("123456");

        page.locator("#customer\\.username").fill(username);

        page.locator("#customer\\.password").fill(password);

        page.locator("#repeatedPassword").fill(password);

        page.locator("input[value='Register']") .click();
    }
}