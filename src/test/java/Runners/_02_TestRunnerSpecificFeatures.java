package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/MER_04_Discounts.feature",
        "src/test/java/FeatureFiles/MER_11_FieldSettings.feature"},
        glue ={"StepDefinitions"},
        dryRun=true // true olduğunda testi çalıştırma sadece featurelara ait steplerin varlığını kontrol et
                      //false olduğunda ise testi çalıştırır. dryRun=true yazılı değilse default false olarak testleri çalıştırır
)

public class _02_TestRunnerSpecificFeatures extends AbstractTestNGCucumberTests {


}
