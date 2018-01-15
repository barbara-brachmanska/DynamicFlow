package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AbstractPage;

public class OfferDescription extends AbstractPage {
    private final static String RESULTS = "#opbox-listing [data-item='true']";

    public OffersDescription(WebDriver driver) {
        super(driver);
    }

    public void selectProduct(String product){

      driver.findElement(By.cssSelector(RESULTS + "[data-analytics-view-custom-position='" + product + "']")).click();
    }


}
