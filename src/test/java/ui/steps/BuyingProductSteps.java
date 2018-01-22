package ui.steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ui.modules.Categories;
import ui.modules.OfferDescription;
import ui.modules.OffersList;
import org.hamcrest.core.Is;
import ui.pages.MainAllegro;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class BuyingProductSteps {

    private BaseUtil base;
    private MainAllegro allegro;
    private Categories category;
    private OffersList results;
    private OfferDescription offerDescr;

    public BuyingProductSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^opened the \"([^\"]*)\" site$")
    public void openedTheSite(String url) throws Throwable {

        allegro = new MainAllegro(base.Driver);
        category = new Categories(base.Driver);
        results = new OffersList(base.Driver);
        offerDescr = new OfferDescription(base.Driver);
        System.out.println(url);
        allegro.open(url);
    }

  /*  @When("^click on \"([^\"]*)\" lookup list and select subcategory$")
    public void clickOnLookupListAndSelectSubcategory(String category, DataTable subcategory) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.category.selectCategory(category, subcategory);
    }*/

    @Then("^list of available offers is shown$")
    public void listOfAvailableOffersIsShown() throws Throwable {
        assertThat(results.offersList.isDisplayed(), Is.is(true));
        assertThat(results.isPresent(), Is.is(true));
    }

    @Then("^auction details page is shown$")
    public void auctionDetailsPageIsShown() throws Throwable {
        assertTrue(offerDescr.checkProductPage());
    }


    @When("^click on Kategorie lookup list and select ([^\"]*) ([^\"]*)$")
    public void clickOnLookupListAndSelectSubcategory(String subcat1, String subcat2) throws Throwable {
        this.category.selectCategory(subcat1, subcat2);

    }

    @When("^([^\"]*) is selected$")
    public void productIsSelected(String product) throws Throwable {
        offerDescr.selectProduct(product);
    }

/*    public class Subcategories {
        private String subcat1;
        private String subcat2;

        public String getSubcat1() {
            return subcat1;
        }

        public void setSubcat1(String subcat1) {
            this.subcat1 = subcat1;
        }

        public String getSubcat2() {
            return subcat2;
        }

        public void setSubcat2(String subcat2) {
            this.subcat2 = subcat2;
        }
    }*/
}
