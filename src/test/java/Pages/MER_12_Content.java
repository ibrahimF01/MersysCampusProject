package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class MER_12_Content extends Parent {
    public MER_12_Content() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath="//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement iban;

    @FindBy(xpath="//mat-select[@formcontrolname='currency']")
    private WebElement currency;

    @FindBy(xpath="//mat-option")
    private List<WebElement> currencyItem;

    @FindBy(xpath="//mat-option//span")
    private List<WebElement> currencyItemText;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchName;

    @FindBy(xpath="//div[contains(text(),'successfully created')]")
    private WebElement addAssert;

    @FindBy(xpath="//div[text()='Field successfully updated']")
    private WebElement editAssert;

    @FindBy(css="hot-toast-container dynamic-view>div")
    private WebElement deleteAssert;

    @FindBy(xpath="//div[text()=' There is no data to display ']")
    private WebElement noDataAssert;

    CommonContent common = new CommonContent();

    @Override
    public void findAndSend(String strElement, String value) {

        myElement = null;
        switch(strElement){
            case "iban":
                myElement = iban;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "searchName":
                myElement = searchName;
                break;
        }

        if(myElement==null){
            common.findAndSend(strElement,value);
        } else{
            sendKeysFunction(myElement,value);
        }

    }

    @Override
    public void findAndClick(String strElement) {
        myElement = null;
        switch(strElement){
            case "bankAccounts":
                myElement = bankAccounts;
                break;
            case "currency":
                myElement = currency;
                break;
        }

        if(myElement == null){
            common.findAndClick(strElement);
        } else{
            clickFunction(myElement);
        }
    }

    @Override
    public void findAndContainsText(String strElement, String text) {
        myElement = null;
        switch(strElement){
            case "noDataAssert" : myElement =noDataAssert; break;
            case "addAssert" : myElement =addAssert; break;
            case "editAssert" : myElement =editAssert; break;
            case "deleteAssert" : myElement =deleteAssert; break;

        }

        if(myElement == null){
            common.findAndContainsText(strElement,text);
        } else{
            verifyContainsText(myElement,text);
        }
    }

    @Override
    public void SearchAndDelete(String searchText) {
        scrollUp();
        scrollToElement(searchName);
        findAndSend("searchName", searchText);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }

    public void findAndSelect(String strElement, String value) {
        switch (strElement) {
            case "currency-select":
                findAndClick("currency");

                for (int i = 0; i < currencyItemText.size(); i++) {
                    if(currencyItemText.get(i).getText().equals(value)){
                        clickFunction(currencyItem.get(i));
                        sendKeyBoard("ESC");
                        break;
                    }
                }

                break;
        }
    }

    public void sendKeyBoard(String key){
        int keyInt = 0;

        switch (key){
            case "ESC":
                keyInt = KeyEvent.VK_ESCAPE;
                break;
            case "TAB":
                keyInt = KeyEvent.VK_TAB;
                break;
            case "ENTER":
                keyInt = KeyEvent.VK_ENTER;
                break;
        }

        if(keyInt > 0) {
            try {
                Robot robot = new Robot();
                robot.keyPress(keyInt);
                robot.keyRelease(keyInt);
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void searchAndEdit(String searchText){
        scrollUp();
        scrollToElement(searchName);
        findAndSend("searchName", searchText);
        findAndClick("search");

        waitUntilLoading();

        findAndClick("edit");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollTo(0, -250)");
    }

}
