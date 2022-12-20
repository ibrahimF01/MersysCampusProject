package Pages;

import Utilities.GWD;
import Utilities.GWDBasic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.awt.SystemColor.text;

public class DialogContent_OA extends Parent {

    public DialogContent_OA() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(css = "[fxlayoutalign='flex-end']")
    private WebElement spaceClick;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    private WebElement successVerify;


    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement searchInputOne;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement searchInputTwo;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(css = "[data-placeholder='Integration Code']")
    public WebElement IntegrationCode;

    @FindBy(css = "ms-search-button button")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button>button") // degisecek !!!
    private WebElement deleteButton;

    @FindBy(css = "ms-edit-button>button") // degisecek !!!
    private WebElement editButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]") // degisecek !!!
    private WebElement deleteDialogButton;

    @FindBy(xpath = "(//ms-text-field//input)[4]")
    private WebElement nameInput;

    @FindBy(css = "[type='text'][pattern='[0-9]*']")
    private WebElement priorityInput;

    @FindBy(css = "[formcontrolname='code']>input")
    private WebElement codeInput;

//    @FindBy(css = "[formcontrolname='priority']>input")
//    private WebElement priorityInputTwo;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "searchInputOne":
                myElement = searchInputOne;
                break;
            case "searchInputTwo":
                myElement = searchInputTwo;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "codeInput":
                myElement = codeInput;
                break;

            case "IntegrationCode":
                myElement = IntegrationCode;
                break;

            case "priorityInput":
                myElement = priorityInput;
                break;
//            case "integrationCode":
//                myElement = codeInput;
//                break;
//            case "priority":
//                myElement = priorityInputTwo;
//                break;


        }
        sendKeysFunction(myElement,value);

    }

    @Override
    public void findAndClick(String strElement) {
        switch (strElement) {

            case "saveButton":
                myElement = saveButton;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "spaceClick":
                myElement = spaceClick;
                break;

            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "editButton":
                myElement = editButton;
                break;
            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;

        }
        clickFunction(myElement);
    }


    @Override
    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "successVerify":
                myElement = successVerify;
                break;

        }
        verifyContainsText(myElement, text);
    }


    @Override
    public void SearchAndDelete(String searchText) {
        findAndSend("searchInputOne", searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");
    }

}
