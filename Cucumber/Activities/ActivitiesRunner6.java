package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"stepDefinitions"},
        tags = "@SmokeTest",
        plugin = {"pretty","html: reports/HTML_Report.html","json: reports/JSON_Report.json"},
        monochrome = true

)

public class ActivitiesRunner6 {
}
