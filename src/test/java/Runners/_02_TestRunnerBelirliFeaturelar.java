package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
        "src/test/java/FeatureFiles/_02_Country.feature"
        },
        glue ={"StepDefinitions"},
        dryRun=true // true olduğunda testi çalıştırma sadece featurelara ait steplerin varlığını kontrol et
                      //false olduğunda ise testi çalıştırır. dryRun=true yazılı değilse default false olarak testleri çalıştırır


)
public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {


}
