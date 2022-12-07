package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",//hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        //plugin = {"html:target//cucumber-reports.html"}
       plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
