package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonContent extends Parent{
    public CommonContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    //LeftNav
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    //DialogContent
    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;



    @Override
   public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priorityCode" : myElement =priorityCode; break;
        }

        sendKeysFunction(myElement, value);
    }
    @Override
    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "fees" : myElement =fees; break;
            case "entranceExamsOne" : myElement =entranceExamsOne; break;
            case "setupTwo" : myElement =setupTwo; break;
            case "entranceExamsTwo" : myElement =entranceExamsTwo; break;

        }

        clickFunction(myElement);
    }
    @Override
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
        }

        verifyContainsText(myElement,text);
    }

    @Override
    public void SearchAndDelete(String searchText){
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }

}
