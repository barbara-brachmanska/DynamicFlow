package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Basia Epam on 04.01.2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"},
        plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}, glue = "steps")

public class TestRunner {

}
