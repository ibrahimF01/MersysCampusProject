package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/Mer_10_Fields.feature"},
        glue = {"StepDefinitions"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _07_TestRunnerExtentReportFields extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "İbrahim Figen");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ability", "Bug Hunter");
    }
}
