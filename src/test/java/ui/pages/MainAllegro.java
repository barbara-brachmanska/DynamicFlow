package ui.pages;

import org.openqa.selenium.WebDriver;

public class MainAllegro extends AbstractPage {

    public MainAllegro(WebDriver driver) {
        super(driver);
    }

    public void open(String url) {
        driver.get(url);
    }

}
