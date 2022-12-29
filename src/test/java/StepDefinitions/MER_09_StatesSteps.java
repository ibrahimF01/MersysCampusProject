package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_09_StatesCont;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class MER_09_StatesSteps {
    MER_09_StatesCont mc=new MER_09_StatesCont();
    CommonContent cc=new CommonContent();

    @And("Select country")
    public void selectCountry(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            mc.findAndClick(listElement.get(i));
        }

    }

    @And("Enter name and short name")
    public void enterNameAndShortName(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            cc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click on the plus button")
    public void clickOnThePlusButton() {
        mc.findAndClick("dialogPlusButton");

    }

    @And("Check country add functions")
    public void checkCountryAddFunctions() {
        mc.findAndSend("CountryNameInput","Kanada");
        cc.findAndSend("codeInput","01KN");
//        GWD.Bekle(1);
//        mc.findAndClick("checkStateButton");
//        mc.findAndClick("checkStateButton");
        mc.findAndClick("closeCountryButton");
    }

    @And("Edit name and short name")
    public void editNameAndShortName(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            cc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
    @Then("Success Message should be displayed")
    public void successmessageShouldBeDisplayed(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++){
            GWD.Bekle(1);
            mc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));}

    }

    @And("Enter the name to search")
    public void enterTheNameToSearch(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            mc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
}
