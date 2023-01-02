package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MER_16_SchoolDepartmentsCont extends Parent {

    public MER_16_SchoolDepartmentsCont() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()=' School Departments ']")
    private WebElement school_Dept;

    @FindBy (xpath = "//ms-add-button//button")
    private WebElement addButton;

    @FindBy(xpath = "//mat-slide-toggle//span[@class='mat-slide-toggle-bar']")
    private WebElement active;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement section;

    @FindBy(xpath = "//span[text()='Department Constants']")
    private WebElement dept_Constants;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'COST')]")
    private WebElement plusButton;

    @FindBy(xpath = "//ms-button//button")
    private WebElement addButton_inBox;

    @FindBy(xpath = "//span[text()='Edit']")
    private WebElement editButton_inBox;

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement key_Constant;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement value_Constant;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'There is already Department')]")
    private WebElement failureMessage;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    private WebElement noData;

    @FindBy(xpath = "//td[text()='Science_Dept']")
    private WebElement Science_Dept;

    @FindBy(xpath = "//td[text()='Art_Dept']")
    private WebElement Art_Dept;

    @FindBy(xpath = "//td[text()='Physics_Sect']")
    private WebElement Physics_Sect;

    @FindBy(xpath = "//td[text()='Experiment']")
    private WebElement Experiment;

    @FindBy (xpath="//td[text()='Literature_Sect']//following::ms-delete-button/button")
    private WebElement delete_Sect;

    @FindBy (xpath="//td[text()='Reading_Const']//following::ms-delete-button/button")
    private WebElement delete_Const;

    @FindBy (xpath="//td[text()='Art_Dept']//following::ms-delete-button/button")
    private WebElement  delete_Dept;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy (xpath = "(//ms-text-field/input)[2]")
    private WebElement value_Label;



    public void findAndClick(String strElement) {
        switch (strElement) {
            case "addButton" : myElement = addButton;break;
            case "active": myElement = active;break;
            case "section": myElement = section;break;
            case "dept_Constants": myElement = dept_Constants;break;
            case "plusButton": myElement = plusButton;break;
            case "addButton_inBox": myElement = addButton_inBox;break;
            case "editButton_inBox": myElement = editButton_inBox;break;
            case "saveButton": myElement = saveButton;break;
            case "Science_Dept": myElement = Science_Dept;break;
            case "Art_Dept": myElement = Art_Dept;break;
            case "Physics_Sect": myElement = Physics_Sect;break;
            case "Experiment": myElement = Experiment;break;
            case "delete_Dept": myElement = delete_Dept;break;
            case "delete_Sect": myElement = delete_Sect;break;
            case "delete_Const": myElement = delete_Const;break;
            case "deleteButton": myElement = deleteButton;break;
            case "deleteDialogBtn": myElement = deleteDialogBtn;break;
            case "value_Label":myElement = value_Label;
        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "key_Constant": myElement = key_Constant;break;
            case "value_Constant": myElement = value_Constant;break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement){
            case "school_Dept": myElement = school_Dept;break;
            case "successMessage": myElement = successMessage;break;
            case "failureMessage": myElement = failureMessage;break;
            case "noData": myElement = noData;break;
        }
        verifyContainsText(myElement,text);
    }

    public void findAndAct(String strElement) {
        switch (strElement) {
            case "plusButton": myElement = plusButton;break;
        }
        HoverOverFunction(myElement);
    }

    @Override
    public void SearchAndDelete(String searchText) {}
}

