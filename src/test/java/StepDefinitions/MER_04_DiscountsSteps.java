package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_04_DiscountsCont;
import Pages.MER_10_FieldsCont;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MER_04_DiscountsSteps {
    CommonContent cc = new CommonContent();
    MER_04_DiscountsCont mer4 = new MER_04_DiscountsCont();
    MER_10_FieldsCont mc=new MER_10_FieldsCont();

    @When("Click the headers under Left Navigation Bar")
    public void ClickTheHeadersUnderLeftNavigationBar(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            cc.findAndClick(listElement.get(i));
    }

    @When("Click the following")
    public void clickTheFollowing(DataTable elements) {
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

    @And("Click the toggle bar and Save button")
    public void ClickTheToggleBarAndSaveButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            mer4.findAndClick(listElement.get(i));
    }

    @Then("Status message should appear on the screen")
    public void statusMessageShouldAppearOnTheScreen(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            mer4.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click the translation button and check the functions")
    public void clickTheTranslationButtonAndCheckTheFunctions() {
        mc.findAndClick("translationButton");
        mc.findAndClick("languageSelect");
        mc.findAndClick("languageEnglish");
        mc.findAndClick("languageSelect");
        mc.findAndClick("languageKazakca");
        mc.findAndClick("languageSelect");
        mc.findAndClick("languageRussian");
        mc.findAndClick("languageSelect");
        mc.findAndClick("languageDeutsch");
        mc.findAndClick("languageSelect");
        mc.findAndClick("languageFrancais");
        mc.findAndClick("languageSelect");
        mc.findAndClick("languageTurkce");
        mc.findAndSend("translationInput","Cesaret");
        mc.findAndClick("deleteIcon");
        mc.findAndClick("applyButton");

    }
}
