package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_04_DiscountsCont extends Parent{

    public MER_04_DiscountsCont(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement description;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement intCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;

    @FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
    private WebElement active;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement descriptionSearch;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement intCodeSearch;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement failureMessage;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    private WebElement noData;


    @Override
    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "description": myElement = description;break;
            case "intCode": myElement = intCode;break;
            case "priority": myElement = priority;break;
            case "descriptionSearch": myElement = descriptionSearch;break;
            case "intCodeSearch": myElement = intCodeSearch;break;
        }
        sendKeysFunction(myElement, value);
    }

    @Override
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "active": myElement = active;break;
            case "saveButton": myElement = saveButton;break;
        }
        clickFunction(myElement);
    }

    @Override
    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "successMessage": myElement = successMessage;break;
            case "failureMessage": myElement = failureMessage;break;
            case "noData": myElement = noData;break;
        }
        verifyContainsText(myElement,text);
    }

    @Override
    public void SearchAndDelete(String searchText) {

    }
}
