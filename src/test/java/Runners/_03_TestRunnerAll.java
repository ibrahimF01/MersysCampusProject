package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/"},
        glue ={"StepDefinitions"}
      // true olduğunda testi çalıştırma sadece featurelara ait steplerin varlığını kontrol et
        //false olduğunda ise testi çalıştırır. dryRun=true yazılı değilse default false olarak testleri çalıştırır

)
        public class _03_TestRunnerAll extends  AbstractTestNGCucumberTests{

}
