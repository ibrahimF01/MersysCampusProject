package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_5_GradeLevel_Content;
import Utilities.GWDBasic;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MER_5_GradeLevelSteps {

    CommonContent cc = new CommonContent();
    MER_5_GradeLevel_Content gdc = new MER_5_GradeLevel_Content();
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

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) cc.findAndClick(s);

    }
}
