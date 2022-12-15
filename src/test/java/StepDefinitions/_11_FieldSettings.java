package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_11_Content;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _11_FieldSettings {
    CommonContent cc = new CommonContent();
    MER_11_Content mer11 = new MER_11_Content();


    @Given("Navigate to Field Setting page")
    public void navigateToFieldSettingPage() throws InterruptedException {
        cc.findAndClick("setupOne");
        cc.findAndClick("parameters");
        cc.findAndClick("fieldSettings");
    }

    @When("Choose {string} Type and click Edit button")
    public void chooseTypeAndClickEditButton(String entity) {
        mer11.findAndClick("fSet_entityType");
        mer11.findAndClick(entity);
        mer11.findAndClick("fSet_edit1");
    }

    @And("Set Order value and activate Required Enabled and Array options")
    public void setOrderValueAndActivateRequiredEnabledAndArrayOptions() {
        mer11.findAndSend("edit_order", "1");
        mer11.findAndClick("edit_required");
        mer11.findAndClick("edit_enabled");
        mer11.findAndClick("edit_array");
        mer11.findAndSend("edit_arrayValues", "700");
        cc.findAndClick("saveButton");
    }

    @Then("User should edit all successfully")
    public void userShouldEditAllSuccessfully() {
        cc.findAndContainsText("successMessage", "successfully updated");
    }


}
