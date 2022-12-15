package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_11_Content;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _11_FieldSettings2 {
    CommonContent cc = new CommonContent();
    MER_11_Content mer11 = new MER_11_Content();

    @When("Choose Employee as Entity and click EditList button")
    public void chooseEmployeeAsEntityAndClickEditListButton() {
        mer11.findAndClick("fSet_entityType");
        mer11.findAndClick("fSet_employee");

            mer11.findAndClick("fSet_EditList");
            mer11.findAndClick("edit_array");
            mer11.findAndClick("edit_required");
            mer11.findAndSend("edit_arrayValues", "700");
            mer11.findAndClick("saveButton");
            mer11.findAndClick("edit_enabled");

            mer11.findAndSend("edit_order", "1");
            cc.findAndContainsText("successMessage", "successfully updated");



    }
}
