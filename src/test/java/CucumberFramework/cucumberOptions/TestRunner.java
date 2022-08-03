package CucumberFramework.cucumberOptions;


//feature

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/CucumberFramework/feature",
        glue = "CucumberFramework/stepDefinitions")


public class TestRunner {



}

