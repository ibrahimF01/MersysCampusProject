package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_07_CountriesCont extends Parent {

    public MER_07_CountriesCont(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement clickSetup;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement clickParameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement clickCountries;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputName;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement inputCode;

    @FindBy(xpath = "//ms-search-button//span[text()='Search']")
    private WebElement clickSearchButton;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement clickAddButton;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")    //(((//tbody[@role='rowgroup']//tr)[1])//following::td)[1]")
    private WebElement clickFirstFound;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input)[2]")
    private WebElement inputFormName;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input)[2]")
    private WebElement inputFormCode;

    @FindBy(xpath = "//ms-save-button//span[text()='Save']")
    private WebElement clickSaveButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement clickFormSaveButton;

    @FindBy(css = "ms-delete-button button")
    private WebElement clickDeleteButton;

    @FindBy(xpath = "//span[@class='mat-button-wrapper'][text()=' Delete ']")
    private WebElement clickFormDeleteButton;

    @FindBy(xpath = "//dynamic-view/div[contains(text(), 'successfully')]")
    private WebElement SuccessMessage;

    @FindBy(xpath = "//dynamic-view/div[contains(text(), 'already exists')]")
    private WebElement ExistMessage;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "inputName": myElement = inputName; break;
            case "inputCode": myElement = inputCode; break;
            case "inputFormName": myElement = inputFormName; break;
            case "inputFormCode": myElement = inputFormCode; break;
        }
        sendKeysFunction(myElement, value);
    }

    @Override
    public void findAndClick(String strElement) {

        switch (strElement) {
            case "acceptCookies": myElement = acceptCookies; break;
            case "clickSetup": myElement = clickSetup; break;
            case "clickParameters": myElement = clickParameters; break;
            case "clickCountries": myElement = clickCountries; break;
            case "clickAddButton": myElement = clickAddButton; break;
            case "clickFirstFound": myElement = clickFirstFound; break;
            case "clickSearchButton": myElement = clickSearchButton; break;
            case "clickSaveButton": myElement = clickSaveButton; break;
            case "clickDeleteButton": myElement = clickDeleteButton; break;
            case "clickFormDeleteButton": myElement = clickFormDeleteButton; break;
            case "clickFormSaveButton": myElement = clickFormSaveButton; break;
        }
        clickFunction(myElement);
    }

    @Override
    public void findAndContainsText(String strElement, String text) {

        switch (strElement)  {
            case "SuccessMessage": myElement = SuccessMessage; break;
            case "ExistMessage": myElement = ExistMessage; break;
            case "inputFormName": myElement = inputFormName; break;
            case "inputFormCode": myElement = inputFormCode; break;

        }
        verifyContainsText(myElement,text);
    }

    @Override
    public void SearchAndDelete(String searchText) {

    }

}
