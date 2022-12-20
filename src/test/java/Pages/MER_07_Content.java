package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_07_Content extends Parent{

    public MER_07_Content {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//span[text()='Setup'][1]")
    private WebElement clickSetup;

    @FindBy(xpath = "//span[text()='Parameters'][1]")
    private WebElement clickParameters;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {

            case "writeName":
                myElement = writeName;
                break;
            case "rename":
                myElement = rename;
                break;
//            case "writeNameRenameit":myElement=writeNameRenameit;break;

        }

        sendKeysFunction(myElement, value);
}
