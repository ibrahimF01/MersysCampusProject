package StepDefinitions;

import Constants.ConstantsClass;
import Pages.CommonContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    CommonContent cc=new CommonContent();


    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get(ConstantsClass.AppUrl);
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        cc.findAndSend("username",ConstantsClass.UserName);
        cc.findAndSend("password",ConstantsClass.Password);
        cc.findAndClick("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        cc.findAndContainsText("dashboard","Dashboard");
        cc.findAndClick("acceptCookies");
    }
}
