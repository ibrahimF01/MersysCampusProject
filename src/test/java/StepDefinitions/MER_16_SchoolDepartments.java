package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_16_SchoolDepartmentsCont;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MER_16_SchoolDepartments {
    CommonContent cc = new CommonContent();
    MER_16_SchoolDepartmentsCont mer16 = new MER_16_SchoolDepartmentsCont();

    @When("Click the following under Left Navigation Bar")
    public void clickTheFollowingUnderLeftNavigationBar(DataTable elements) {

        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            cc.findAndClick(listElement.get(i));
    }

    @And("Fill in the next fields")
    public void fillInTheNextFields(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            cc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Drag the toggle bar")
    public void dragTheToggleBar(DataTable elements) {

        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            mer16.findAndClick(listElement.get(i));
    }

    @And("Click the next header and its first row element")
    public void clickTheNextHeaderAndItsFirstRowElement(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(1);
            mer16.findAndClick(listElement.get(i));
        }
    }

    @And("Click the in-box Add button")
    public void clickTheInBoxAddButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            mer16.findAndClick(listElement.get(i));
    }

    @And("Fill in the Dept.Constant fields")
    public void fillInTheDeptConstantFields(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            mer16.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click the button or element following")
    public void clickTheButtonOrElementFollowing(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(1);
            mer16.findAndClick(listElement.get(i));
        }
    }
    @And("Click the next header and hover over plus button")
    public void clickTheNextHeaderAndHoverOverPlusButton() {
        mer16.findAndClick("dept_Constants");
        mer16.findAndAct("plusButton");
        mer16.findAndClick("Experiment");
    }

    @And("Click the dept.Constants and hover over Plus button so that rows are displayed, then delete the selected row element and click Save")
    public void clickTheButtonsRespectively() {
        mer16.findAndClick("dept_Constants");
        GWD.Bekle(1);
        mer16.findAndAct("plusButton");
        GWD.Bekle(1);
        mer16.findAndClick("delete_Const");
        mer16.findAndClick("deleteDialogBtn");
        mer16.findAndClick("saveButton");
    }

    @Then("Validating element or message should be displayed")
    public void validatingElementOrMessageShouldBeDisplayed(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            mer16.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
    }
}
