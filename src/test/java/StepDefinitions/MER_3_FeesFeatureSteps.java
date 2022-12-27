package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_3_Fees_Content;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MER_3_FeesFeatureSteps {

    CommonContent cc = new CommonContent();
    MER_3_Fees_Content dcOA = new MER_3_Fees_Content();
    @And("Navigate to Fees Functionality")
    public void navigateToFeesFunctionality(DataTable elements) {

        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) cc.findAndClick(s);

    }

    @When("Adding a new fee")
    public void addingANewFee(DataTable elements) {

         dcOA.findAndClick("addButton");

        List<List<String>> listElement = elements.asLists(String.class);
        for (List<String> strings : listElement) dcOA.findAndSend(strings.get(0), strings.get(1));

        dcOA.findAndClick("spaceClick");
        dcOA.findAndClick("saveButton");
    }


    @Then("Success message should be displayedd")
    public void successMessageShouldBeDisplayedd() {

        dcOA.findAndContainsText("successVerify","success");
    }

    @When("Search Last Fees")
    public void searchLastFeesAndUpdateIt(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);
        for (List<String> strings : listElement) dcOA.findAndSend(strings.get(0), strings.get(1));

        dcOA.findAndClick("searchButton");
        dcOA.findAndClick("editButton");
    }

    @And("Update it")
    public void updateIt(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);
        for (List<String> strings : listElement) dcOA.findAndSend(strings.get(0), strings.get(1));

        dcOA.findAndClick("spaceClick");
        dcOA.findAndClick("saveButton");

    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);
        for (List<String> strings : listElement) dcOA.findAndSend(strings.get(0), strings.get(1));

        dcOA.findAndClick("searchButton");
        dcOA.findAndClick("deleteButton");
        dcOA.findAndClick("deleteDialogButton");
    }
}
