package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        //plugin = {"html:target//cucumber-reports.html"}
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
       // monochrome = true
)
public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {



}


