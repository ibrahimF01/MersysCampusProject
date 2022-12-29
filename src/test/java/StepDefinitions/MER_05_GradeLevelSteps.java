package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_05_GradeLevelCont;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class MER_05_GradeLevelSteps {

    CommonContent cc = new CommonContent();
    MER_05_GradeLevelCont gdc = new MER_05_GradeLevelCont();
    @And("Create to new GradeLevel")
    public void createToNewGradeLevel(DataTable elements) {

        gdc.findAndClick("addButton");

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i=0; i<listElement.size(); i++)

            gdc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }

    @And("Click to nextGradeLevel")
    public void clickToNextGradeLevel(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i=0; i < listElement.size(); i++){

            gdc.findAndClick(listElement.get(i));
        }
    }

    @Then("Success message should be displayed from GradeLevel")
    public void successMessageShouldBeDisplayedFromGradeLevel() {

        gdc.findAndVerify("successMessage", "success");
    }

    @And("Edit to GradeLevel")
    public void editToGradeLevel(DataTable elements) {

        gdc.findAndClick("editButton");

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)

            gdc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click to Delete button from GradeLevel")
    public void clickToDeleteButtonFromGradeLevel() {

        gdc.findAndClick("deleteIcon");
        gdc.findAndClick("deleteButton");
    }

    @And("Click on the element in the Left Nav")
    public void clickOnTheElementInTheleftNav(DataTable elements) {

        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) cc.findAndClick(s);

    }
}
