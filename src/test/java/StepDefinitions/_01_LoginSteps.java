package StepDefinitions;

import Constants.ConstantsClass;
import Pages.CommonContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    CommonContent cc=new CommonContent();


    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get(ConstantsClass.AppUrl);
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        cc.findAndSend("username",ConstantsClass.UserName);
        cc.findAndSend("password",ConstantsClass.Password);
        cc.findAndClick("loginButton");
        cc.findAndClick("acceptCookies");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        cc.findAndContainsText("dashboard","Dashboard");
        //cc.findAndClick("acceptCookies");
    }
}
