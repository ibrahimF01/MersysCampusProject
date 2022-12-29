package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_11_FieldSettingCont;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MER_11_FieldSettings2 {
    CommonContent cc = new CommonContent();
    MER_11_FieldSettingCont mer11 = new MER_11_FieldSettingCont();

    @Given("Navigate to Field Setting menu")
    public void navigateToFieldSettingMenu(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) cc.findAndClick(s);
        GWD.Bekle(1);
    }
    @When("Select Entity Type, activate the following toggle bars and click Edit button")
    public void selectEntityTypeActivateTheFollowingToggleBarsAndClickEditButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) mer11.findAndClick(s);
    }

    @And("Assign values for Order and Array fields")
    public void assignValuesForOrderAndArrayFields(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);
        for (List<String> strings : listElement) mer11.findAndSend(strings.get(0), strings.get(1));
    }

    @And("Disable the two toggle bars, enable the last toggle bar")
    public void disableTheTwoToggleBarsEnableTheLastToggleBar(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) mer11.findAndClick(s);
    }

    @And("Click Save button")
    public void clickSaveButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) cc.findAndClick(s);
    }

    @Then("Success message should appear on the screen")
    public void successMessageShouldAppearOnTheScreen(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);
        for (List<String> strings : listElement) cc.findAndContainsText(strings.get(0), strings.get(1));
    }
}


