package StepDefinitions;

import Pages.CommonContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FieldSettings {
    CommonContent cc = new CommonContent();
    @Given("Navigate to Field Setting page")
    public void navigateToFieldSettingPage() {
        cc.findAndClick("setupOne");
        cc.findAndClick("parameters");
        cc.findAndClick("fieldSettings");
    }
    @When("Choose an Entity Type and click Edit button")
    public void chooseAnEntityTypeAndClickEditButton() {
        cc.findAndClick("fSet_entityType");
        cc.findAndClick("fSet_student");
        cc.findAndClick("fSet_edit1");

        }

    @And("Set Order value and activate Required Enabled and Array options")
    public void setOrderValueAndActivateRequiredEnabledAndArrayOptions() {
        cc.findAndSend("edit_order", "1");
        cc.findAndClick("edit_required");
        cc.findAndClick("edit_enabled");
        cc.findAndClick("edit_array");
        cc.findAndSend("edit_arrayValues", "700");
        cc.findAndClick("saveButton");
    }

    @Then("User should edit all successfully")
    public void userShouldEditAllSuccessfully() {
        cc.findAndContainsText("successMessage","successfully updated");
    }
}

//        List<WebElement> edit = GWD.getDriver().findElements(By.xpath("ms-edit-button//button"));
//        for (int i = 0; i < edit.size(); i++)
//           cc.findAndClick("edit.get(i)");
