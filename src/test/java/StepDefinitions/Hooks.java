package StepDefinitions;
;
import Constants.ConstantsClass;
import Pages.CommonContent;
import Utilities.CommonUtils;
import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before
    public void before() {
        CommonUtils.loadProperties();
        System.out.println("Senaryo başladı");
        Login();

    }

    @After
    public void after(Scenario scenario) {
        System.out.println("Senaryo Bitti");
        System.out.println("scenario sonucu=" + scenario.getStatus());
        System.out.println("scenario isFailed ?=" + scenario.isFailed());

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        if (scenario.isFailed()) {
            // klasöre
            TakesScreenshot screenshot = (TakesScreenshot) GWD.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);

            //            //Extend Reporta ekliyor
           ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());

            try {
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/" + scenario.getId() + date.format(formatter) + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // ekran görüntüsü al senaryo hatalı ise
        GWD.quitDriver();
    }
    public String getBase64Screenshot()
    {
        return ((TakesScreenshot) GWD.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
    public static void Login(){
        CommonContent cc=new CommonContent();
        GWD.getDriver().get(ConstantsClass.AppUrl);
        GWD.getDriver().manage().window().maximize();
        cc.findAndSend("username",ConstantsClass.UserName);
        cc.findAndSend("password",ConstantsClass.Password);
        cc.findAndClick("loginButton");
        cc.findAndClick("acceptCookies");
        cc.findAndContainsText("dashboard","Dashboard");
    }
}