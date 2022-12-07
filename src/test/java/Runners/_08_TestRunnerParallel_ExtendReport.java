package Runners;
import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
)

public class _08_TestRunnerParallel_ExtendReport extends AbstractTestNGCucumberTests {
    @BeforeClass(alwaysRun = true) // bazı java versiyon hatalırı için
    @Parameters("browser")
    public void beforeClass(String browser)
    {
        GWD.threadBrowserName.set(browser);
        //burada browser set edilecek
        // bu threade browsername set edildi.
    }

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "İsmet Temur");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
    }
}
