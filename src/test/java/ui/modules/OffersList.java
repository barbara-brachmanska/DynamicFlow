package ui.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.AbstractPage;

public class OffersList extends AbstractPage{
    public OffersList(WebDriver driver) {
        super(driver);
    }

    public final static String OFFERS_LIST = "#opbox-listing";

    @FindBy(css = OFFERS_LIST)
    public WebElement offersList;



    public boolean isPresent() {
        return isPresent(By.cssSelector(OFFERS_LIST));
    }
}
