package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_06_ORC;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class MER_06_DTP_FUNC {


    MER_06_ORC mrc = new MER_06_ORC();


    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Click the section in order to reach the Documents")
    public void clickTheSectionInOrderToReachTheDocuments() throws InterruptedException {
        mrc.findAndClick("acceptCookies112");
        mrc.findAndClick("clickInSetup");
        mrc.findAndClick("clickInParameters");
        mrc.findAndClick("clickInDocumentTypes");



    }

    @When("Create section")
    public void createSection() throws AWTException, InterruptedException {
        Actions action1 = new Actions(GWD.getDriver());
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(mrc.clickInAddButton)).click();
        mrc.findAndSend("writeName", "vorname1");
        mrc.findAndClick("clickIconInStage");
        mrc.findAndClick("selectCertificate");

        wait.until(ExpectedConditions.visibilityOf(mrc.clickinASave));
        action1.doubleClick(mrc.clickinASave).build().perform();

    }


    @And("Edit section")
    public void editSection() throws InterruptedException, AWTException {

        wait.until(ExpectedConditions.elementToBeClickable(mrc.clickInEdit)).click();

        mrc.findAndSend("rename", "vornameeeeeeeeeeeeeeeeeee");

        mrc.findAndClick("reSave");

    }

    @And("Delete section")
    public void deleteSection() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(mrc.clickInDelete)).click();
        mrc.findAndClick("clickInDeleteYes");
    }

}


