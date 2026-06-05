package pages;

import com.microsoft.playwright.Page;

public class AccountPage {

    Page page;

    public AccountPage(Page page) {
        this.page = page;
    }

    public String getBalance() {

        page.getByText("Accounts Overview").click();

        String balance = page.locator("table")
                .locator("tr")
                .nth(1)
                .locator("td")
                .nth(1)
                .innerText();

        System.out.println("Account Balance = " + balance);

        return balance;
    }
}