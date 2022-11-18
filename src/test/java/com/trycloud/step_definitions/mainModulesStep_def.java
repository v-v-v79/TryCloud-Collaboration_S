package com.trycloud.step_definitions;

import com.trycloud.pages.MainModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class mainModulesStep_def {

    MainModulePage mainModulePage = new MainModulePage();
   Actions actions = new Actions(Driver.getDriver());



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/apps/dashboard/");

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
    public void userShouldBeAbleAccessingAllTheMainModules(){
    actions.moveToElement(mainModulePage.recommendedFiles);
    String expected="Recommended files";
    String actual = mainModulePage.recommendedFiles.getText();

        Assert.assertTrue(actual.contains(expected));
        actions.moveToElement(mainModulePage.talkMentions);
     expected="Talk mentions";
    actual = mainModulePage.talkMentions.getText();

        Assert.assertTrue(actual.contains(expected));

        actions.moveToElement(mainModulePage.upcomingEvents);
     expected="Upcoming Events";
   actual = mainModulePage.upcomingEvents.getText();

        Assert.assertTrue(actual.contains(expected));



    }
}



