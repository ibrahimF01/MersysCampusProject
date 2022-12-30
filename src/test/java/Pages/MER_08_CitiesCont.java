package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MER_08_CitiesCont extends Parent{
    public MER_08_CitiesCont(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies112;
    @FindBy(xpath = "//span[text()='Setup'][1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters'][1]")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Cities'][1]")
    private WebElement clickCities;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "(//div[starts-with(@class,'mat-select-arrow-wrapper ng-tns')])[3]")
    private WebElement ClickCountry;

    @FindBy(xpath = "//span[text()=' Germany ']")
    private WebElement clickCountryGermany;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath="//div[contains(@class,'mat-select-value ng-tns-c96-50')]") //
    private WebElement CountrySearch;
    @FindBy(xpath="//span[text()=' Germany ']")
    private WebElement CountrySearchGermany;
    @FindBy(xpath="//input[@type='text']")   //   //ms-text-field[@placeholder='GENERAL.FIELD.NAME']
    private WebElement SearchName;
    @FindBy(css="div[fxlayoutalign='center center'][class='control-full']")
    private WebElement SearchButton;
    @FindBy(xpath="//ms-edit-button[@class='ng-star-inserted']")
    private WebElement editButton;
   @FindBy(css="ms-dialog-content input[data-placeholder='Name']")
   private WebElement editName;


    public WebElement getEditName() {
        return editName;
    }
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement delete;
    WebElement myElement;

    @Override
    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "nameInput":myElement=nameInput;break;
            case "SearchName":myElement=SearchName;break;
           case "editName":myElement=editName;break;

        }
        sendKeysFunction(myElement, value);

    }

    @Override
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "acceptCookies112":myElement=acceptCookies112;break;
            case "setupOne":myElement=setupOne;break;
            case "parameters":myElement=parameters;break;
            case "clickCities":myElement=clickCities;break;
            case "addButton":myElement=addButton;break;
            case "ClickCountry":myElement=ClickCountry;break;
            case "clickCountryGermany":myElement=clickCountryGermany;break;
            case "saveButton":myElement=saveButton;break;
            case "CountrySearch":myElement=CountrySearch;break;
            case "CountrySearchGermany":myElement=CountrySearchGermany;break;
            case "SearchButton":myElement=SearchButton;break;
            case "editButton":myElement=editButton;break;
           case "deleteButton":myElement=deleteButton;break;
           case "delete":myElement=delete;break;

        }
        clickFunction(myElement);

    }

    @Override
    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {



        }

        verifyContainsText(myElement, text);

    }

    @Override
    public void SearchAndDelete(String searchText) {

        findAndSend("SearchName","pelin1");

        findAndClick("SearchButton");


       // WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"CountrySearch"));

        findAndClick("deleteButton");
        findAndClick("delete");
    }



}





