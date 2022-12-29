package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_05_GradeLevelCont extends Parent {

    public MER_05_GradeLevelCont() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    WebElement myElement;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement order;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement nextGrade;

    @FindBy(xpath = "(//mat-option[@role='option'])[1]")
    private WebElement nextGradeNalan;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//*[@data-icon='pen-to-square'])[2]")
    private WebElement editButton;

    @FindBy(xpath = "(//ms-delete-button//button)[2]")
    private WebElement deleteIcon;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteButton;


    public void findAndClick(String element) {

        switch (element) {
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "nextGrade":
                myElement = nextGrade;
                break;
            case "nextGradeNalan":
                myElement = nextGradeNalan;
                break;
            case "editButton":
                myElement = editButton;
                break;
            case "deleteIcon":
                myElement = deleteIcon;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
        }
        clickFunction(myElement);
    }

    @Override
    public void findAndContainsText(String strElement, String text) {

    }

    @Override
    public void SearchAndDelete(String searchText) {

    }

    public void findAndSend(String element, String value) {

        switch (element) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "shortNameInput":
                myElement = shortNameInput;
                break;
            case "order":
                myElement = order;
                break;
        }
        sendKeysFunction(myElement, value);

    }

    public void findAndVerify(String element, String text) {

        switch (element) {
            case "successMessage":
                myElement = successMessage;
                break;
        }
        verifyContainsText(myElement, text);
    }
}