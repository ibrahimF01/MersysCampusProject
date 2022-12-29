package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_06_DocumentTypesCont extends Parent {

    public MER_06_DocumentTypesCont() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //LeftNav


    ////////////////////orcun112///////////////////

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies112;
    @FindBy(xpath = "//span[text()='Setup'][1]")
    private WebElement clickInSetup;

    @FindBy(xpath = "//span[text()='Parameters'][1]")
    private WebElement clickInParameters;

    @FindBy(xpath = "//span[text()='Document Types'][1]")
    public WebElement clickInDocumentTypes;

    //(//span[starts-with(@class,'mat-button-focus-overlay')])[10]
    @FindBy(css = "[data-icon='plus']")
    public WebElement clickInAddButton;

    //(//div[starts-with(@class,'mat-form-field-infix ng-tns-')])[4]
    @FindBy(xpath = "(//*[@type='text'])[2]")
    private WebElement writeName;


    @FindBy(xpath = "(//div[starts-with(@class,'mat-select-arrow-wrapper ng-tns')])[3]")
    private WebElement clickIconInStage;

    @FindBy(xpath = "//span[text()=' Certificate ']")
    private WebElement selectCertificate;

    //(//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[4]

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement clickinASave;


    @FindBy(xpath = "//div[text()='Document successfully created']")
    private WebElement confirmRegistraionMessage;

    //////////////////////////////////////

//    @FindBy(css = "[data-placeholder='Name']")
//    public WebElement writeNameRenameit;
//
//    @FindBy(xpath = "//span[text()='Search']")
//    private WebElement serachbutton;


    @FindBy(css = "ms-edit-button>button[class$='ng-star-inserted']")
    public WebElement clickInEdit;
    // (//*[@class='ng-fa-icon'])[6]


    @FindBy(xpath = "(//*[@type='text'])[2]")
    private WebElement rename;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement reSave;

    @FindBy(xpath = "//div[text()='Document successfully updated']")
    private WebElement reEditedSuccessMessage;


    @FindBy(css = "[data-icon='trash-can']")
    public WebElement clickInDelete;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement clickInDeleteYes;

    @FindBy(xpath = "//div[text()='Document successfully deleted']")
    private WebElement successDeleteMessage;
    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {

            ///////////orcun112///////////////////////

            case "writeName":
                myElement = writeName;
                break;
            case "rename":
                myElement = rename;
                break;
//            case "writeNameRenameit":myElement=writeNameRenameit;break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {


            //////////orcun112//////////////////////////////////////
            case "acceptCookies112":
                myElement = acceptCookies112;
                break;

            case "clickInSetup":
                myElement = clickInSetup;
                break;
            case "clickInParameters":
                myElement = clickInParameters;
                break;
            case "clickInDocumentTypes":
                myElement = clickInDocumentTypes;
                break;
            case "clickInAddButton":
                myElement = clickInAddButton;
                break;
            case "clickIconInStage":
                myElement = clickIconInStage;
                break;
            case "selectCertificate":
                myElement = selectCertificate;
                break;
            case "clickinASave":
                myElement = clickinASave;
                break;
//            case "serachbutton":myElement=serachbutton;break;
            case "clickInEdit":
                myElement = clickInEdit;
                break;
            case "reSave":
                myElement = reSave;
                break;


            case "clickInDelete":
                myElement = clickInDelete;
                break;
            case "clickInDeleteYes":
                myElement = clickInDeleteYes;
                break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {

//            case "clickInDocumentTypes":myElement=clickInDocumentTypes;break;

            case "confirmRegistraionMessage":
                myElement = confirmRegistraionMessage;
                break;
            case "reEditedSuccessMessage":
                myElement = reEditedSuccessMessage;
                break;
            case "successDeleteMessage":
                myElement = successDeleteMessage;
                break;

        }

        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) {
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }

}



