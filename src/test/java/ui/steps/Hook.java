package ui.steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {
    private BaseUtil base;

   // WebDriver driver;
    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("opening browser: Chrome");
      // System.setProperty("webdriver.firefox.marionette","C:\\libs\\geckodriver.exe");
     //  WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\libs\\chromedriver.exe");
        base.Driver = new ChromeDriver();
        //Driver.get("http://www.onet.pl");

    }

    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        System.out.println("closing browser: MOCK");

      base.Driver.close();
    }
}
