package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    protected static WebDriver driver;

    public AbstractPage(WebDriver driver) {
        AbstractPage.driver = driver;
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    protected static boolean isPresent(By by) {
        return driver.findElements(by).size() > 0;
    }

    protected static void waitFor(WebElement element, int maxWaitTime) {
        new WebDriverWait(driver, maxWaitTime).until(ExpectedConditions.visibilityOf(element));
    }

    protected void clearEnterText(WebElement element, String inputText) {
        waitFor(element, 10);
        element.clear();
        element.sendKeys(inputText);
    }
}
