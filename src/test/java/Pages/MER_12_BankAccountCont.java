package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class MER_12_BankAccountCont extends Parent {
    public MER_12_BankAccountCont() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement iban;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']")
    private WebElement currency;

    @FindBy(xpath = "//mat-option")
    private List<WebElement> currencyItem;

    @FindBy(xpath = "//mat-option//span")
    private List<WebElement> currencyItemText;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchName;

    @FindBy(xpath = "//div[contains(text(),'successfully created')]")
    private WebElement addAssert;

    @FindBy(xpath = "//div[contains(text(),'successfully updated')]")
    private WebElement editAssert;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successAssert;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExistsAssert;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    private WebElement alreadyAssert;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    private WebElement noDataAssert;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteAcceptBtn;

    @FindBy(xpath = "//app-simple-dialog//h3//strong[text()='Delete']")
    private WebElement deleteDialog;

    @FindBy(xpath = "//button[@aria-label=\"Close dialog\"]")
    private WebElement closeDialogBtn;

    CommonContent common = new CommonContent();

    @Override
    public void findAndSend(String strElement, String value) {

        myElement = null;
        switch (strElement) {
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

        if (myElement == null) {
            common.findAndSend(strElement, value);
        } else {
            sendKeysFunction(myElement, value);
        }

    }

    @Override
    public void findAndClick(String strElement) {
        myElement = null;
        switch (strElement) {
            case "bankAccounts":
                myElement = bankAccounts;
                break;
            case "currency":
                myElement = currency;
                break;
            case "deleteOK":
                myElement = deleteAcceptBtn;
                break;
            case "closeDialog":
                myElement = closeDialogBtn;
                break;
        }

        if (myElement == null) {
            common.findAndClick(strElement);
        } else {
            clickFunction(myElement);
        }
    }

    @Override
    public void findAndContainsText(String strElement, String text) {
        myElement = null;
        switch (strElement) {
            case "noDataAssert":
                myElement = noDataAssert;
                break;
            case "addAssert":
                myElement = addAssert;
                break;
            case "editAssert":
                myElement = editAssert;
                break;
            case "alreadyexists":
                myElement = alreadyExistsAssert;
                break;
            case "success":
                myElement = successAssert;
                break;
            case "already":
                myElement = alreadyAssert;
                break;
        }

        if (myElement == null) {
            common.findAndContainsText(strElement, text);
        } else {
            verifyContainsText(myElement, text);
        }
    }

    @Override
    public void SearchAndDelete(String searchText) {
        scrollUp();
        scrollToElement(searchName);
        findAndSend("searchName", searchText);
        findAndClick("searchButton");

        //waitUntilLoading();
        GWD.Bekle(3);

        findAndClick("deleteButton");

        waitUntilVisible(deleteDialog);

        findAndClick("deleteOK");
    }

    public void findAndSelect(String strElement, String value) {
        switch (strElement) {
            case "currency-select":
                findAndClick("currency");

                for (int i = 0; i < currencyItemText.size(); i++) {
                    if (currencyItemText.get(i).getText().equals(value)) {
                        clickFunction(currencyItem.get(i));
                        sendKeyBoard("ENTER");
                        sendKeyBoard("ESC");
                        break;
                    }
                }

                break;
        }
    }

    public void sendKeyBoard(String key) {
        int keyInt = 0;

        switch (key) {
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

        if (keyInt > 0) {
            try {
                Robot robot = new Robot();
                robot.keyPress(keyInt);
                robot.keyRelease(keyInt);
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void searchAndEdit(String searchText) {
        scrollUp();
        scrollToElement(searchName);
        findAndSend("searchName", searchText);
        findAndClick("searchButton");

        // waitUntilLoading();
        GWD.Bekle(3);

        findAndClick("editButton");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollTo(0, -250)");
    }
}
