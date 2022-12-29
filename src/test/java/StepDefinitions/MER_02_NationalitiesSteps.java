package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_02_NationalitiesCont;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MER_02_NationalitiesSteps {
    CommonContent cc = new CommonContent();
    MER_02_NationalitiesCont mer02Content=new MER_02_NationalitiesCont();

    @Given("Navigate to Nationalities Page functionality")
    public void navigateToNationalitiesPageFunctionality() {
        cc.findAndClick("setupOne");
        cc.findAndClick("parameters");
        cc.findAndClick("nationalities");

    }

    @When("Create {string} new Nationalites")
    public void createNewNationalites(String name) {
        cc.findAndClick("addButton");
        cc.findAndSend("nameInput",name);
        cc.findAndClick("saveButton");
    }

    @Then("Success massage should be displayed")
    public void successMassageShouldBeDisplayed() {
        cc.findAndContainsText("successMessage","successfully");
    }

    @When("Update an existent Nationality {string}")
    public void updateAnExistentNationality(String name) {
        mer02Content.findAndSend("searchName",name);
        cc.findAndClick("searchButton");
    }

    @And("Edit Nationality {string}")
    public void editNationality(String editName) {
        GWD.Bekle(2);
        mer02Content.findAndClick("editButton");
        cc.findAndSend("nameInput",editName);
        cc.findAndClick("saveButton");
    }

    @When("Delete Nationality {string}")
    public void deleteNationality(String deleteName) {
        mer02Content.findAndSend("searchName",deleteName);
        cc.findAndClick("searchButton");
        GWD.Bekle(2);
        cc.findAndClick("deleteButton");
        mer02Content.findAndClick("deleteNationBtn");
    }

    @When("Cannot create a Nationality with the same name {string}")
    public void cannotCreateANationalityWithTheSameName(String name) {
        cc.findAndClick("addButton");
        cc.findAndSend("nameInput",name);
        cc.findAndClick("saveButton");
    }

    @Then("Already exists massage should be shown")
    public void alreadyExistsMassageShouldBeShown() {
        cc.findAndContainsText("alreadyExist","already exists");
        mer02Content.findAndClick("closeDialogBtn");
        GWD.Bekle(2);
    }

    @When("Cancel Delete Nationality {string}")
    public void cancelDeleteNationality(String cancelDelete) {
        mer02Content.findAndSend("searchName",cancelDelete);
        cc.findAndClick("searchButton");
        GWD.Bekle(2);
        cc.findAndClick("deleteButton");
        mer02Content.findAndClick("deleteCancelBtn");
    }
}
