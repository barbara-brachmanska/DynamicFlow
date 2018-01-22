package ui.steps;

import Base.BaseUtil;
import ui.Transformation.EmailTransform;
import ui.Transformation.SalaryCountTransformer;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import ui.pages.LoginPage;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Basia Epam on 04.01.2018.
 */
public class LoginSteps {

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^navigate to login page$")
    public void navigateToLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.Driver.get("http://www.executeautomation.com/demosite/Login.html");
        System.out.println(" login in ");
    }

    @And("^enter following for login$")
    public void enterUsernameAndPassword(DataTable table) throws Throwable {
        List<User> users = table.asList(User.class);
        LoginPage page = new LoginPage(base.Driver);

        for (User user : users) {
            page.Login(user.username, user.password);
        }
    }

    @And("^click login button$")
    public void clickLogin() throws Throwable {
        LoginPage page = new LoginPage(base.Driver);
        page.ClickLogin();
    }

    @Then("^should see userform page$")
    public void shouldSeeUserformPage() throws Throwable {
        Assert.assertEquals("It's not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
    }

    @Then("^should see userform page wrongly$")
    public void shouldSeeUserformPageWrongly() throws Throwable {
        System.out.println("wrong page");
        //  Assert.assertEquals("It's not displayed", false , true);
    }

    @When("^enter user email address as Email:([^\"]*)$")
    public void enterUserEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
        System.out.println("The email address is " + email);
    }

    @And("^verify the count of my salary digits for Rs (\\d+)$")
    public void verifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryCountTransformer.class) int salary) throws Throwable {
        System.out.println("my salary digit count is " + salary);
    }

    @When("^click on Moje Allegro - Zaloguj sie$")
    public void clickOnMojeAllegroZalogujSie() throws Throwable {
        base.Driver.findElement(By.cssSelector(".opbox-metrum-header__account-name-wrapper")).click();
        Thread.sleep(2000);
        base.Driver.findElement(By.cssSelector(".opbox-metrum-header__account-login")).click();

    }

    @Then("^should see userform error page$")
    public void shouldSeeUserformErrorPage() throws Throwable {
        Thread.sleep(2000);
        try {
            assertTrue(base.Driver.findElement(By.cssSelector(".alert-danger")).isDisplayed());
        }
        catch (Exception e) {
            e.getMessage();
            System.out.println(" Error is not shown" );
        }
    }


    public class User {

        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}

