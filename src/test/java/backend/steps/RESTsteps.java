package backend.steps;

import Base.BaseUtil;
import backend.Requests;
import backend.URLs;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static org.assertj.core.api.Assertions.assertThat;


public class RESTsteps {
private BaseUtil baseUtil;
    private Response responseAllCountries;
    private Response responseOneCountry;
    private Requests api = new Requests();

    public RESTsteps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("^endpoint for getting countries$")
    public void endpointForGettingCountries() throws Throwable {
        responseAllCountries = api.get(URLs.URL_ALL);
        responseOneCountry = api.get(URLs.URL_COUNTRY);

    }

    @When("^response status is equal (\\d+)$")
    public void responseTimeIsEqual(int status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat(responseAllCountries.getStatusCode()).isEqualTo(status);
        assertThat(responseOneCountry.getStatusCode()).isEqualTo(status);
    }

//    @Then("^list of all countries is displayed$")
//    public void listOfAllContriesIsDisplayed() throws Throwable {
//        responseAllCountries.body().print();
//    }

    @Given("^Country ISO$")
    public void countryISO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^display details of selected country$")
    public void displayDetailsOfSelectedCountry() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    public class Country {
        private String country;

        public Country(String country) {
            this.country = country;
        }
    }
}
