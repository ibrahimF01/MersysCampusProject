package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_10_Content;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;


public class MER_10_Steps {
    CommonContent cc=new CommonContent();
    MER_10_Content mc=new MER_10_Content();

    @And("Click on the Left Nav")
    public void clickOnTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            cc.findAndClick(listElement.get(i));
        }

    }

    @And("Click on the Plus Button")
    public void clickOnThePlusButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            mc.findAndClick(listElement.get(i));
        }

    }

    @And("Enter name and code")
    public void enterNameAndCode(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            cc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Check if others can selected and select Field Type")
    public void checkIfOthersCanSelectedAndSelectFieldType() {
        mc.findAndClick("fieldType");
        mc.findAndClick("typeNumber");
        mc.findAndClick("fieldType");
        mc.findAndClick("typeText");
        mc.findAndClick("fieldType");
        mc.findAndClick("typeInteger");
        mc.findAndClick("fieldType");
        mc.findAndClick("typeDate");
        mc.findAndClick("fieldType");
        mc.findAndClick("typeLogical");
        mc.findAndClick("fieldType");
        mc.findAndClick("typeMemoField");
        mc.findAndClick("fieldType");
        mc.findAndClick("typeListOfValue");
        mc.findAndSend("keyInput","Matrix1");
        mc.findAndSend("valueInput","Neo");
        mc.findAndClick("addOrEdit");
        mc.findAndSend("keyInput","Matrix2");
        mc.findAndSend("valueInput","Trinity");
        mc.findAndClick("addOrEdit");
        mc.findAndClick("sizeSelect");
        mc.findAndClick("size_1");
        mc.findAndClick("naviNext");
        mc.findAndClick("naviPrevious");
        mc.findAndClick("naviLast");
        mc.findAndClick("naviFirst");
        mc.findAndClick("editButtonX");
        mc.findAndSend("keyInput","Matrix3");
        mc.findAndSend("valueInput","Morpheus");
        mc.findAndClick("addOrEdit");
        GWD.Bekle(1);
        mc.findAndClick("deleteButtonX");
        mc.findAndClick("dialogClose");
        mc.findAndClick("deleteButtonX");
        mc.findAndClick("deleteAccept");
        mc.findAndClick("deleteButtonX");
        mc.findAndClick("deleteAccept");
        mc.findAndContainsText("noDataAssert","no data to display");

        mc.findAndClick("fieldType");
        mc.findAndClick("typeComposite");
        mc.findAndContainsText("noDataAssert","no data to display");

        mc.findAndClick("fieldType");
        mc.findAndClick("typeText");
    }

    @And("Click on the translation button and check the functions")
    public void clickOnTheTranslationButtonAndCheckTheFunctions() {
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

    @And("Click on the save button")
    public void clickOnTheSaveButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            cc.findAndClick(listElement.get(i));
        }
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++){
            GWD.Bekle(1);
            mc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));}

    }

    @And("Enter name in search field")
    public void enterNameInSearchField(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            mc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

    }

    @And("Click on the search button")
    public void clickOnTheSearchButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            cc.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the edit button")
    public void clickOnTheEditButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            mc.findAndClick(listElement.get(i));
        }

    }

    @And("Edit name and code")
    public void editNameAndCode(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            cc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click on the delete button")
    public void clickOnTheDeleteButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            GWD.Bekle(1);
            mc.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the delete button to delete")
    public void clickOnTheDeleteButtonToDelete(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            mc.findAndClick(listElement.get(i));
        }
    }

    @Then("Warning message should be displayed")
    public void warningMessageShouldBeDisplayed(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            mc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));

    }
}
