package StepDefinitions;

import Pages.CommonContent;
import Pages.MER_07_Content;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class MER_07_Steps {

    CommonContent cc=new CommonContent();
    MER_07_Content mer7 = new MER_07_Content();

    @Given("Navigate to Countries Setting Menu")
    public void navigateToCountriesSettingMenu(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++) {
            mer7.findAndClick(listElement.get(i));
        }
    }

    @When("Click The Add Button")
    public void clickTheAddButton() {
        mer7.findAndClick("clickAddButton");
    }

    @And("Input The Country Informations")
    public void InputTheCountryInformations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        mer7.findAndSend("inputName", listElement.get(0));
        mer7.findAndSend("inputCode", listElement.get(1));
    }
    @And("Click The Search Button")
    public void clickTheSearchButton() {
        mer7.findAndClick("clickSearchButton");
    }
    @And("InputForm The Country Informations")
    public void InputFormTheCountryInformations(DataTable elements) {
       List<String> listElement = elements.asList(String.class);
       mer7.findAndSend("inputFormName", listElement.get(0));
       mer7.findAndSend("inputFormCode", listElement.get(1));
    }

    @And("Click The Save Button")
    public void clickTheSaveButton() {
        mer7.findAndClick("clickSaveButton");
    }

    @Then("Confirm The Country Informations")
    public void confirmTheCountryInformations(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        mer7.findAndContainsText("inputFormName", listElement.get(0));
        mer7.findAndContainsText("inputFormCode", listElement.get(1));
        mer7.findAndClick("ListNameRow");
    }

    @And("Click On The First Country Name Found")
    public void clickOnTheFirstCountryNameFound() {
       mer7.findAndClick("clickFirstFound");
    }

    @And("Click The Delete Button")
    public void clickTheDeleteButton() {
        mer7.findAndClick("clickDeleteButton");
    }

    @And("Check The Country Informations to Delete")
    public void checkTheCountryInformationsToDelete(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        mer7.findAndContainsText("inputFormName", listElement.get(0));
        mer7.findAndContainsText("inputFormCode", listElement.get(1));
    }

    @And("Click The Delete Button On CheckBox")
    public void clickTheDeleteButtonOnCheckBox() {
    }

    @Then("Confirm The Country Informations is Not Available")
    public void confirmTheCountryInformationsIsNotAvailable() {
    }

    @Then("Confirm The Message")
    public void confirmTheMessage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        mer7.findAndContainsText(listElement.get(0), listElement.get(1));
    }

    @And("Click On The FormDelete Button")
    public void clickOnTheFormDeleteButton() {
        mer7.findAndClick("clickOnTheFormDeleteButton");
    }
}
