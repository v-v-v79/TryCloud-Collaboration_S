package com.trycloud.step_definitions;

import com.trycloud.pages.MainModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;


public class mainModulesStep_def {

    MainModulePage mainModulePage = new MainModulePage();
   Actions actions = new Actions(Driver.getDriver());


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/login?clear=1");

    }

    @When("user  enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        mainModulePage.login(username, password);

    }

    @When("user click login button")
    public void user_click_login_button() {
        mainModulePage.btn_login.click();
    }


    @Then("user should be able accessing all the main modules")
    public void userShouldBeAbleAccessingAllTheMainModules() {


    }
}



