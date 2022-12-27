package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_9_Content extends Parent{
    public MER_9_Content() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(css="ms-dialog-content mat-form-field mat-select")
    private WebElement CountrySelect;
    @FindBy(xpath="//span[text()=' Ukraine ']")
    private WebElement UkraineSelect;
    @FindBy(css="ms-dialog-content ms-add-button button")
    private WebElement dialogPlusButton;
    @FindBy(css="country-dialog button[aria-label='Close dialog']")
    private WebElement closeCountryButton;
    @FindBy(css="country-dialog ms-text-field[placeholder='GENERAL.FIELD.NAME'] input")
    private WebElement CountryNameInput;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    private WebElement succesMessage;
    @FindBy(xpath="//div[contains(text(),'already exists')]")
    private WebElement negativeMessage;
    @FindBy(css="input[data-placeholder='Name']")
    private WebElement searchNameInput;




    @Override
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "CountryNameInput" : myElement =CountryNameInput; break;
            case "searchNameInput" : myElement =searchNameInput; break;

        }

        sendKeysFunction(myElement, value);
    }
    @Override
    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "CountrySelect" : myElement =CountrySelect; break;
            case "UkraineSelect" : myElement =UkraineSelect; break;
            case "dialogPlusButton" : myElement =dialogPlusButton; break;
            case "closeCountryButton" : myElement =closeCountryButton; break;

        }

        clickFunction(myElement);
    }
    @Override
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "succesMessage" : myElement =succesMessage; break;
            case "negativeMessage" : myElement =negativeMessage; break;

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
