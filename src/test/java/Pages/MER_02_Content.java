package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_02_Content extends Parent {

    public MER_02_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'mat-form-field-infix ng')]//input")
    WebElement searchName;

    @FindBy(xpath = "//ms-edit-button[@class=\"ng-star-inserted\"]//button")
    WebElement editButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteNationBtn;

    @FindBy(xpath = "//button[@aria-label=\"Close dialog\"]")
    private WebElement closeDialogBtn;

    @FindBy(xpath = "(//div[@class=\"ng-star-inserted\"]//button)[1]")
    private WebElement deleteCancelBtn;


    @Override
    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "searchName": myElement = searchName;
                break;
        }
        sendKeysFunction(myElement, value);

    }

    @Override
    public void findAndClick(String strElement) {
        switch (strElement)
        {
            case "editButton" : myElement =editButton; break;
            case "deleteNationBtn" : myElement =deleteNationBtn; break;
            case "closeDialogBtn" : myElement =closeDialogBtn; break;
            case "deleteCancelBtn" : myElement =deleteCancelBtn; break;
        }
        clickFunction(myElement);
    }

    @Override
    public void findAndContainsText(String strElement, String text) {

    }

    @Override
    public void SearchAndDelete(String searchText) {

    }
}
