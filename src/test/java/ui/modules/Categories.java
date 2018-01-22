package ui.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.AbstractPage;

public class Categories extends AbstractPage {

    private final static String CATEGORIES_DROPDOWN = "[data-dropdown-id='categories_dropdown']";
    private final static String SUBCATEGORY = "data-accordion-id";
   // private final static String SUBCATEGORY2 = "m-link";

    @FindBy(css = CATEGORIES_DROPDOWN)
    private WebElement category;

    public Categories(WebDriver driver) {
        super(driver);

    }


    public void selectCategory(String subcat1, String subcat2) throws InterruptedException {

        String subcategory2 = "//div[@data-box-name!='all_category' and @data-prototype-id='allegro.navigation.links']";
        Thread.sleep(2000);
        this.category.click();
        Thread.sleep(2000);
       // Subcategory(subcat1,subcat2);
        String subcatLink = "[" + SUBCATEGORY + " = '" + subcat1 + "']";
        System.out.println(subcatLink);
        //   Thread.sleep(2000);
        driver.findElement(By.cssSelector(subcatLink)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(subcategory2 + "//a[text()='" + subcat2 + "']")).click();
        //driver.findElement(By.cssSelector(subcatLink)).click();
        //div[@data-box-name!='all_category' and @data-prototype-id='allegro.navigation.links']//a[text()='Komputery']
       }

  /*  public void Subcategory(String subcat1, String subcat2) {

        String subcatLink = "[" + SUBCATEGORY + " = '" + subcat1 + "']";
        System.out.println(subcatLink);
     //   Thread.sleep(2000);
        driver.findElement(By.cssSelector(subcatLink)).click();

        subcatLink = "a[text()='" + subcat2 + "']." + SUBCATEGORY2 ;
        System.out.println(subcatLink);
        driver.findElement(By.cssSelector(subcatLink)).click();


    }*/
}