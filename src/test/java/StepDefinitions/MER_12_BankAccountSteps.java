package StepDefinitions;

import Pages.MER_12_BankAccountCont;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class MER_12_BankAccountSteps {
    MER_12_BankAccountCont content = new MER_12_BankAccountCont();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        GWD.Bekle(2);

        for (int i = 0; i < elementList.size(); i++) {
            content.findAndClick(elementList.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        GWD.Bekle(2);

        for (int i = 0; i < elementList.size(); i++) {
            content.findAndClick(elementList.get(i));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable elements) {
        List<List<String>> elementList = elements.asLists(String.class);

        GWD.Bekle(2);

        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).get(0).contains("-select"))
                content.findAndSelect(elementList.get(i).get(0), elementList.get(i).get(1));
            else
                content.findAndSend(elementList.get(i).get(0), elementList.get(i).get(1));
        }
    }

    @And("User Edit item from Dialog")
    public void userEditItemFromDialog(DataTable elements) {
        List<List<String>> elementList = elements.asLists(String.class);

        GWD.Bekle(2);

        content.searchAndEdit(elementList.get(0).get(1));

        for (int i = 1; i < elementList.size(); i++) {
            content.findAndSend(elementList.get(i).get(0), elementList.get(i).get(1));
        }
    }

    @And("User Delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        GWD.Bekle(2);

        content.SearchAndDelete(elementList.get(0));
    }

    @Then("Already exists massage should be displayed")
    public void alreadyExistsMassageShouldBeDisplayed() {
        content.findAndContainsText("alreadyexists", "already exists");
        content.findAndClick("closeDialogBtn");
        GWD.Bekle(2);
    }

    @Then("Successfully message should be displayed")
    public void successfullymessageshouldbedisplayed() {
        content.findAndContainsText("success", "successfully");
        GWD.Bekle(2);
    }
}
