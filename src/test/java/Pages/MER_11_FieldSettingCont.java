package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MER_11_FieldSettingCont extends Parent{

    public MER_11_FieldSettingCont(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath="(//div[contains(@id,'mat-select-value')])[1]")
    private WebElement fSet_entityType;

    @FindBy(xpath="(//mat-option[@role='option']//span[@class='mat-option-text'])[2]")
    private WebElement fSet_student;

    @FindBy(xpath="(//mat-option[@role='option']//span[@class='mat-option-text'])[3]")
    private WebElement fSet_employee;

    @FindBy (xpath = "(//span[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin'])[1]")
    private WebElement fSet_required;

    @FindBy (xpath = "(//span[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin'])[2]")
    private WebElement fSet_enabled;

    @FindBy(xpath="(//ms-edit-button//button)[1]")
    private WebElement fSet_edit1;

    @FindBy(xpath="//ms-edit-button//button")
    private List<WebElement> fSet_EditList;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='order']/input")
    private WebElement edit_order;

    @FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[1]")
    private WebElement edit_required;

    @FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[2]")
    private WebElement edit_enabled;

    @FindBy(xpath="(//span[@class='mat-slide-toggle-bar'])[3]")
    private WebElement edit_array;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='size']/input")
    private WebElement edit_arrayValues;


    @Override
    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "edit_order": myElement = edit_order;break;
            case "edit_arrayValues": myElement = edit_arrayValues;break;
        }
        sendKeysFunction(myElement, value);
    }
    int cnt=0;

    @Override
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "fSet_entityType" : myElement =fSet_entityType; break;
            case "fSet_student" : myElement =fSet_student; break;
            case "fSet_employee" : myElement =fSet_employee; break;
            case "fSet_required" : myElement =fSet_required; break;
            case "fSet_enabled" : myElement =fSet_enabled; break;
            case "fSet_edit1" : myElement = fSet_edit1;break;
            case "fSet_EditList" : myElement = fSet_EditList.get(cnt++);break;
            case "edit_required" : myElement =edit_required; break;
            case "edit_enabled" : myElement =edit_enabled; break;
            case "edit_array" : myElement =edit_array; break;
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


