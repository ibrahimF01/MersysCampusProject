package StepDefinitions;

import Pages.CommonContent;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FieldSettings3 {
    CommonContent cc = new CommonContent();

    @When("Choose Employee as Entity and click EditList button")
    public void chooseEmployeeAsEntityAndClickEditListButton() {
        cc.findAndClick("fSet_entityType");
        cc.findAndClick("fSet_employee");

//        for (int i = 0; i < EditList.size(); i++) {
//
//        cc.findAndClick("fSet_EditList.get(i)");}

        List<WebElement> EditL = GWD.getDriver().findElements(By.xpath("//ms-edit-button//button"));
        for (int i = 0; i < EditL.size(); i++) {
            cc.findAndClick(String.valueOf(EditL.get(i)));

            cc.findAndSend("edit_order", "1");
            cc.findAndClick("edit_required");
            cc.findAndClick("edit_enabled");
            cc.findAndClick("edit_array");
            cc.findAndSend("edit_arrayValues", "700");
            cc.findAndClick("saveButton");

            cc.findAndContainsText("successMessage", "successfully updated");


        }


    }
}
