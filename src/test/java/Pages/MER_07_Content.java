package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

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
    private WebElement clickSearch;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement clickAddButton;

    @FindBy(xpath = "(//tbody[@role='rowgroup']//tr)[1]")
    private WebElement clickFirstFound;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input)[2]")
    private WebElement inputFormName;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input)[2]")
    private WebElement inputFormCode;

    @FindBy(xpath = "//ms-save-button//span[text()='Save']")
    private WebElement clickSaveButton;

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
            case "clickSearch": myElement = clickSearch; break;
            case "clickAddButton": myElement = clickAddButton; break;
            case "clickFirstFound": myElement = clickFirstFound; break;
            case "clickSaveButton": myElement = clickSaveButton; break;

        }

        clickFunction(myElement);
    }

    @Override
    public void findAndContainsText(String strElement, String text) {

        switch (strElement)  {
//            case "dashboard" : myElement =dashboard; break;
//            case "successMessage" : myElement =successMessage; break;
//            case "alreadyExist" : myElement =alreadyExist; break;
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
