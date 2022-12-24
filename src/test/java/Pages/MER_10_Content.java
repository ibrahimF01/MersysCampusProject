package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_10_Content extends Parent{

    public MER_10_Content() {
        PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(css="ms-add-button[tooltip]>div>button")
    private WebElement addButton1;
    @FindBy(css="mat-select[formcontrolname='type']")
    private WebElement fieldType;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' Number ']")
    private WebElement typeNumber;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' Text ']")
    private WebElement typeText;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' Integer ']")
    private WebElement typeInteger;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' List of Value ']")
    private WebElement typeListOfValue;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' Date ']")
    private WebElement typeDate;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' Logical ']")
    private WebElement typeLogical;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' Memo Field ']")
    private WebElement typeMemoField;
    @FindBy(xpath="//span[@class='mat-option-text'][text()=' Composite ']")
    private WebElement typeComposite;
    @FindBy(css="input[data-placeholder='Key']")
    private WebElement keyInput;
    @FindBy(css="input[data-placeholder='Value']")
    private WebElement valueInput;
    @FindBy(css="ms-button>button")
    private WebElement addOrEdit;
    @FindBy(css="div[class='ng-star-inserted'] div[class='mat-paginator-outer-container'] mat-select")
    private WebElement sizeSelect;
    @FindBy(xpath="//mat-option/span[text()=' 1 ']")
    private WebElement size_1;
    @FindBy(css="div[class='ng-star-inserted'] button[class*='mat-paginator-navigation-first']")
    private WebElement naviFirst;
    @FindBy(css="div[class='ng-star-inserted'] button[class*='mat-paginator-navigation-previous']")
    private WebElement naviPrevious;
    @FindBy(css="div[class='ng-star-inserted'] button[class*='mat-paginator-navigation-next']")
    private WebElement naviNext;
    @FindBy(css="div[class='ng-star-inserted'] button[class*='mat-paginator-navigation-last']")
    private WebElement naviLast;
    @FindBy(css="div[class='ng-star-inserted'] ms-edit-button>button")
    private WebElement editButtonX;
    @FindBy(css="div[class='ng-star-inserted'] ms-delete-button>button")
    private WebElement deleteButtonX;
    @FindBy(css="div[class='ng-star-inserted']>button[color='accent']")
    private WebElement deleteAccept;
    @FindBy(css="div[class='ng-star-inserted']>button[mat-dialog-close]")
    private WebElement dialogClose;
    @FindBy(xpath="//div[text()=' There is no data to display ']")
    private WebElement noDataAssert;
    @FindBy(css="button[matsuffix]")
    private WebElement translationButton;
    @FindBy(css="mat-select[formcontrolname='language']")
    private WebElement languageSelect;
    @FindBy(xpath="//span[text()=' English ']")
    private WebElement languageEnglish;
    @FindBy(xpath="//span[text()=' Қазақша ']")
    private WebElement languageKazakca;
    @FindBy(xpath="//span[text()=' Русский ']")
    private WebElement languageRussian;
    @FindBy(xpath="//span[text()=' Deutsch ']")
    private WebElement languageDeutsch;
    @FindBy(xpath="//span[text()=' Türkçe ']")
    private WebElement languageTurkce;
    @FindBy(xpath="//span[text()=' Français ']")
    private WebElement languageFrancais;
    @FindBy(css="input[formcontrolname='translation']")
    private WebElement translationInput;
    @FindBy(css="div>[class='ng-star-inserted']>ms-add-button button")
    private WebElement plusButton;
    @FindBy(css="ms-dialog-content mat-form-field+button")
    private WebElement deleteIcon;
    @FindBy(css="ms-button[caption='GENERAL.BUTTON.APPLY']>button")
    private WebElement applyButton;
    @FindBy(css="ms-edit-button>button")
    private WebElement editButton;
    @FindBy(xpath="//div[contains(text(),'successfully created')]")
    private WebElement addAssert;
    @FindBy(xpath="//div[contains(text(),'already exists')]")
    private WebElement addNegativeAssert;
    @FindBy(xpath="//div[text()='Field successfully updated']")
    private WebElement editAssert;
    @FindBy(css="hot-toast-container dynamic-view>div")
    private WebElement deleteAssert;
    @FindBy(css="ms-delete-button button")
    private WebElement deleteButton;
    @FindBy(css="ms-text-field[placeholder='GENERAL.FIELD.NAME']>input")
    private WebElement searchInput;
    @FindBy(css="mms-text-field[placeholder='GENERAL.FIELD.CODE']>input")
    private WebElement codeInput;







    @Override
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "keyInput" : myElement =keyInput; break;
            case "valueInput" : myElement =valueInput; break;
            case "translationInput" : myElement =translationInput; break;
            case "searchInput" : myElement =searchInput; break;
            case "codeInput" : myElement =codeInput; break;
        }

        sendKeysFunction(myElement, value);
    }
    @Override
    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "fieldType" : myElement =fieldType; break;
            case "typeNumber" : myElement =typeNumber; break;
            case "typeText" : myElement =typeText; break;
            case "typeInteger" : myElement =typeInteger; break;
            case "typeListOfValue" : myElement =typeListOfValue; break;
            case "typeDate" : myElement =typeDate; break;
            case "typeLogical" : myElement =typeLogical; break;
            case "typeMemoField" : myElement =typeMemoField; break;
            case "typeComposite" : myElement =typeComposite; break;
            case "addButton1" : myElement =addButton1; break;
            case "addOrEdit" : myElement =addOrEdit; break;
            case "sizeSelect" : myElement =sizeSelect; break;
            case "size_1" : myElement =size_1; break;
            case "naviFirst" : myElement =naviFirst; break;
            case "naviPrevious" : myElement =naviPrevious; break;
            case "naviNext" : myElement =naviNext; break;
            case "naviLast" : myElement =naviLast; break;
            case "editButtonX" : myElement =editButtonX; break;
            case "deleteButtonX" : myElement =deleteButtonX; break;
            case "deleteAccept" : myElement =deleteAccept; break;
            case "dialogClose" : myElement =dialogClose; break;
            case "translationButton" : myElement =translationButton; break;
            case "languageSelect" : myElement =languageSelect; break;
            case "languageEnglish" : myElement =languageEnglish; break;
            case "languageKazakca" : myElement =languageKazakca; break;
            case "languageRussian" : myElement =languageRussian; break;
            case "languageDeutsch" : myElement =languageDeutsch; break;
            case "languageTurkce" : myElement =languageTurkce; break;
            case "languageFrancais" : myElement =languageFrancais; break;
            case "plusButton" : myElement =plusButton; break;
            case "deleteIcon" : myElement =deleteIcon; break;
            case "applyButton" : myElement =applyButton; break;
            case "editButton" : myElement =editButton; break;
            case "deleteButton" : myElement =deleteButton; break;


        }

        clickFunction(myElement);
    }
    @Override
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "noDataAssert" : myElement =noDataAssert; break;
            case "addAssert" : myElement =addAssert; break;
            case "addNegativeAssert" : myElement =addNegativeAssert; break;
            case "editAssert" : myElement =editAssert; break;
            case "deleteAssert" : myElement =deleteAssert; break;

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
