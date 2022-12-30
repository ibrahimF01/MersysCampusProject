package StepDefinitions;

import Pages.MER_08_CitiesCont;

import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MER_08_CitiesSteps{
    MER_08_CitiesCont mr=new MER_08_CitiesCont();





    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));


    @And("Click Setup ,paramenters, cities section")
    public void clickSetupParamentersCitiesSection() throws InterruptedException {
        Thread.sleep(3000);
        mr.findAndClick("acceptCookies112");
        mr.findAndClick("setupOne");
        mr.findAndClick("parameters");
        mr.findAndClick("clickCities");
        //Thread.sleep(3000);
        mr.findAndClick("addButton");
        Thread.sleep(3000);


    }

    @When("Create country ,name section")
    public void createCountrynameSection() throws InterruptedException {
        mr.findAndClick("ClickCountry");
        Thread.sleep(3000);
        mr.findAndClick("clickCountryGermany");
        Thread.sleep(3000);

        mr.findAndSend("nameInput", "pelin");
        Thread.sleep(3000);
        mr.findAndClick("saveButton");


    }

    @And("Edit country section")
    public void editCountrySection() throws InterruptedException {

        mr.findAndClick("CountrySearch");
        mr.findAndClick("CountrySearchGermany");

        // mr.findAndSend("SearchName","pelin");

        mr.findAndClick("SearchButton");
        mr.findAndClick("editButton");

        // mr.findAndClick("editCountry");
        mr.clickFunction(mr.getEditName());
          mr.getEditName().clear();
         // mr.sendKeysFunction(mr.getEditName(),"pelin1");
        mr.findAndSend("editName", "pelin1");
        mr.findAndClick("saveButton");

    }

    @And("Delete country section")
    public void deleteCountrySection() {

        mr.SearchAndDelete("pelin1");






    }


}




