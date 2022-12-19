package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MER_07_Content extends Parent {

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//span[text()='Setup'][1]")
    private WebElement clickSetup;

    @FindBy(xpath = "//span[text()='Parameters'][1]")
    private WebElement clickParameters;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {

            case "writeName":
                //myElement = writeName;
                break;
            case "rename":
                //myElement = rename;
                break;
//            case "writeNameRenameit":myElement=writeNameRenameit;break;

        }

        sendKeysFunction(myElement, value);
    }

    @Override
    public void findAndClick(String strElement) {

    }

    @Override
    public void findAndContainsText(String strElement, String text) {

    }

    @Override
    public void SearchAndDelete(String searchText) {

    }
}
