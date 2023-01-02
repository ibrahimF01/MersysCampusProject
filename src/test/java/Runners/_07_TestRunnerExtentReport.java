package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _07_TestRunnerExtentReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Product Owner", "Ahmet Demir");
        ExtentService.getInstance().setSystemInfo("Scrum Master", "Serkan Bey");
        ExtentService.getInstance().setSystemInfo("User Name", "İbrahim Figen");
        ExtentService.getInstance().setSystemInfo("User Name", "Hüseyin Yılmaz");
        ExtentService.getInstance().setSystemInfo("User Name", "Orçun İlgen");
        ExtentService.getInstance().setSystemInfo("User Name", "Zekeriya Demirel");
        ExtentService.getInstance().setSystemInfo("User Name", "Ömer Avcı");
        ExtentService.getInstance().setSystemInfo("User Name", "Ahmet Mutlu");
        ExtentService.getInstance().setSystemInfo("User Name", "Erkan Kurtağa");
        ExtentService.getInstance().setSystemInfo("User Name", "Şükrü Kılıç");
        ExtentService.getInstance().setSystemInfo("User Name", "Pelin Çimen");
        ExtentService.getInstance().setSystemInfo("Application Name", "Your Website");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ability", "Bug Hunter");
    }
}
