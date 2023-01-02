package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/MER_04_Discounts.feature",
        "src/test/java/FeatureFiles/MER_11_FieldSettings.feature"},
        glue ={"StepDefinitions"}
        //dryRun=true --> olduğunda testi çalıştırma sadece featurelara ait steplerin varlığını kontrol et
        //dryRun=false -->olduğunda ise testi çalıştırır.
        // yazılı değilse default false olarak testleri çalıştırır --> drtRun=false
)

public class _02_TestRunnerSpecificFeatures extends AbstractTestNGCucumberTests {


}
