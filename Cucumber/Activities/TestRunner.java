package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"stepDefinition"},
        tags = "@activity1",
        plugin = {"json: test-reports/json-report.json"},
//        plugin = {"pretty"},
        //plugin = {"html: test-reports"},
        monochrome = true
)

public class TestRunner {}