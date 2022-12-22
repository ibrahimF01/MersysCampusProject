package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class MER_07_Content extends Parent {

    public MER_07_Content(){
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

    @FindBy(xpath = "(//ms-delete-button//span[text()='Delete'])[1]")
    private WebElement clickDeleteButton;

    @FindBy(xpath = "(//button//span[text()=' Delete ']")
    private WebElement clickFormDeleteButton;

    @FindBy(xpath = "//dynamic-view/div[contains(text(), 'successfully')]")
    private WebElement SuccessMessage;

    @FindBy(xpath = "//dynamic-view/div[contains(text(), 'already exists')]")
    private WebElement ExistMessage;


//    @FindBy(xpath = "//tbody/tr[@role='row']")
//    public List<WebElement> ListNameRow;

//    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input]")
//    private WebElement ListNameLine;
//
//    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input]")
//    private List<WebElement> ListCodeLine;


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
            case "clickSearchButton": myElement = clickSearchButton; break;
            case "clickAddButton": myElement = clickAddButton; break;
            case "clickFirstFound": myElement = clickFirstFound; break;
            case "clickSaveButton": myElement = clickSaveButton; break;
            case "clickDeleteButton": myElement = clickDeleteButton; break;
            case "clickFormDeleteButton": myElement = clickFormDeleteButton; break;

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
    public void SearchAndDelete(String searchText){

        //scrollUp()
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        //waitUntilLoading();
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }

}
