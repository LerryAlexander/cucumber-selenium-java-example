
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumberOptions"},
        features = "src/test/java/features",
        glue = {"stepDefinitions", "utilities"},
        dryRun = false,
        monochrome = true,
        tags = {"@release"}
)

public class TestRunner {
}