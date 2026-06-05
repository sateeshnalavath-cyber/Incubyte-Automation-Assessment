package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import pages.AccountPage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.BaseTest;

public class SignupSteps extends BaseTest {

    RegisterPage registerPage;
    LoginPage loginPage;
    AccountPage accountPage;

    @Before
    public void setup() { launchBrowser();}

    @Given("User launches Parabank application")
    public void user_launches_parabank_application() {

        registerPage = new RegisterPage(page);
        loginPage = new LoginPage(page);
        accountPage = new AccountPage(page);
    }

    @When("User registers a new account")
    public void user_registers_a_new_account() {

        registerPage.registerUser();
    }


    @Then("User should see account overview page")
    public void user_should_see_account_overview_page() {

        System.out.println("Login Successful");
    }

    @And("User account balance should be displayed")
    public void user_account_balance_should_be_displayed() {

        accountPage.getBalance();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
