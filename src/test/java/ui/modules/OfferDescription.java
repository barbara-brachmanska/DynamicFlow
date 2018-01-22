package ui.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.pages.AbstractPage;

public class OfferDescription extends AbstractPage {

    public OfferDescription(WebDriver driver) {
        super(driver);
    }

    private final static String RESULTS = "#opbox-listing [data-item='true']";
    //private final static String PRODUCT_TITLE = "a[text()]";
    public String productTitle;

    public void selectProduct(String product) {
        productTitle = driver.findElement(By.cssSelector(RESULTS + "[data-analytics-view-custom-position='" + product + "'] h2 a")).getText();
        System.out.println("this is text: " + productTitle);
        driver.findElement(By.cssSelector(RESULTS + "[data-analytics-view-custom-position='" + product + "']")).click();
    }

    public boolean checkProductPage(){
        String displayedTitle = driver.findElement(By.cssSelector("h1.title")).getText();

        if (displayedTitle.contains(productTitle)){
            System.out.println("product description is shown");
            return true;
        }
        System.out.println("product is not shown");
        return false;
    }

}
