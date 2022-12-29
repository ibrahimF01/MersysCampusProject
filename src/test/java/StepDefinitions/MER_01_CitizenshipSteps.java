package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_01_CitizenshipCont;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MER_01_CitizenshipSteps {
    CommonContent cc = new CommonContent();
    MER_01_CitizenshipCont mr= new MER_01_CitizenshipCont();

    @Given("Click on the Citizenship tab")
    public void clickOnTheCitizenshipTab() {
    cc.findAndClick("setupOne");
    cc.findAndClick("parameters");
    cc.findAndClick("citizenShip");
    }

    @When("New country must be registered")
    public void newCountryMustBeRegistered() {
        cc.findAndClick("addButton");
        cc.findAndSend("nameInput","tasoland");
        cc.findAndSend("shortName","taso");
        cc.findAndClick("saveButton");

    }

    @Then("Description success message should be displayed")
    public void descriptionSuccessMessageShouldBeDisplayed() {
        cc.findAndContainsText("successMessage","success");
    }

    @When("country registration must be changed")
    public void countryRegistrationMustBeChanged() {
        mr.findAndSend("SearcName","tasoland");
        cc.findAndClick("searchButton");
        mr.findAndClick("EditButton");
        cc.findAndSend("nameInput","Altaykoy");
        cc.findAndClick("saveButton");
    }

    @When("Search should be made with uppercase and lowercase letters.")
    public void searchShouldBeMadeWithUppercaseAndLowercaseLetters() {
        mr.findAndSend("SearcName","AlTaYKoY");
        cc.findAndClick("searchButton");
    }

    @Then("verify that the country is listed on the screen")
    public void verifyThatTheCountryIsListedOnTheScreen() {

        mr.CitizenList.contains("Altaykoy");
    }

    @When("A registered country must be re-registered")
    public void aRegisteredCountryMustBeReRegistered() {
        cc.findAndClick("addButton");
        cc.findAndSend("nameInput","Altaykoy");
        cc.findAndSend("shortName","taso");
        cc.findAndClick("saveButton");
    }

    @Then("Verify that the registration was unsuccessful")
    public void verifyThatTheRegistrationWasUnsuccessful() {
        cc.findAndContainsText("alreadyExist","exists");
    }

    @When("must be re-registered using a registered country spell and lowercase")
    public void mustBeReRegisteredUsingARegisteredCountrySpellAndLowercase() {
        cc.findAndClick("addButton");
        cc.findAndSend("nameInput","AlTayKoy");
        cc.findAndSend("shortName","TASO");
        cc.findAndClick("saveButton");
    }

    @When("registered country must be deleted")
    public void registeredCountryMustBeDeleted() {
        mr.findAndSend("SearcName","AlTaYKoY");
        cc.findAndClick("searchButton");
        GWD.Bekle(1);
        cc.findAndClick("deleteButton");
        cc.findAndClick("deleteDialogBtn");

    }
    @When("-Non-existing country should be written in the search field.")
    public void nonExistingCountryShouldBeWrittenInTheSearchField() {
        mr.findAndSend("SearcName","AlTaYKoY");
        cc.findAndClick("searchButton");
    }


    @Then("Verify that the country is not on the list")
    public void verifyThatTheCountryIsNotOnTheList() {
        mr.findAndContainsText("bosList","no data");
    }
}
