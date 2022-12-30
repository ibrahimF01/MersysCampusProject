package StepDefinitions;

import Pages.MER_08_CitiesCont;

import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MER_08_CitiesSteps{
    MER_08_CitiesCont mr=new MER_08_CitiesCont();





    @And("Click Setup ,paramenters, cities section")
    public void clickSetupParamentersCitiesSection() throws InterruptedException {

        mr.findAndClick("acceptCookies112");
        mr.findAndClick("setupOne");
        mr.findAndClick("parameters");
        mr.findAndClick("clickCities");
        mr.findAndClick("addButton");


    }

    @When("Create country ,name section")
    public void createCountrynameSection() throws InterruptedException {
        mr.findAndClick("ClickCountry");
        mr.findAndClick("clickCountryGermany");
        mr.findAndSend("nameInput", "pelin");
        mr.findAndClick("saveButton");


    }

    @And("Edit country section")
    public void editCountrySection() throws InterruptedException {

        mr.findAndClick("CountrySearch");
        mr.findAndClick("CountrySearchGermany");
        mr.findAndClick("SearchButton");
        mr.findAndClick("editButton");
        mr.clickFunction(mr.getEditName());
        mr.getEditName().clear();
        mr.findAndSend("editName", "pelin1");
        mr.findAndClick("saveButton");

    }

    @And("Delete country section")
    public void deleteCountrySection() {

        mr.SearchAndDelete("pelin1");




    }


}




