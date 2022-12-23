package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_04_Content;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MER_04_Discounts {
    CommonContent cc = new CommonContent();
    MER_04_Content mer4 = new MER_04_Content();

    @And("Click on the headers under Left Navigation Bar")
    public void ClickOnTheHeadersUnderLeftNavigationBar(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            cc.findAndClick(listElement.get(i));
    }

    @When("Click on the following")
    public void clickOnTheFollowing(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(1);
            cc.findAndClick(listElement.get(i));
        }
    }

    @And("Fill in the following fields")
    public void fillInTheFollowingFields(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            mer4.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click on the toggle bar and Save button")
    public void ClickOnTheToggleBarAndSaveButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            mer4.findAndClick(listElement.get(i));
    }

    @Then("Status message should come out on the screen")
    public void statusMessageShouldComeOutOnTheScreen(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            mer4.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
    }
}
