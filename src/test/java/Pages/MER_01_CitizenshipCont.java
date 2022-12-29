package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MER_01_CitizenshipCont extends Parent{
    public MER_01_CitizenshipCont(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(css="[data-placeholder='Name']")
    private WebElement SearcName;
    @FindBy(xpath="//ms-edit-button//button")
    private WebElement EditButton;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> CitizenList;
    @FindBy(xpath = "//*[contains(text(),'no data')]")
    public WebElement bosList;



    @Override
    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "SearcName": myElement = SearcName;break;

        }
        sendKeysFunction(myElement, value);
    }
    int cnt=0;

    @Override
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "EditButton" : myElement =EditButton; break;

        }
        clickFunction(myElement);
    }
    @Override
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "bosList" : myElement =bosList; break;

        }

        verifyContainsText(myElement,text);
    }


    @Override
    public void SearchAndDelete(String searchText) {

    }



}

