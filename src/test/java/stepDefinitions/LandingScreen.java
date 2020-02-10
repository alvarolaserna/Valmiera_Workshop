package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUI.Configuration;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class LandingScreen {
    @Given("I open the application")
    public void iOpenTheApplication() {
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "src/test/resources/groceries-app.apk";
        open();
        sleep(3000);
    }

    @When("I click on add shopping list")
    public void iClickOnAddShoppingList() {
        
    }

    @And("I type {string}")
    public void iType(String arg0) {
        
    }

    @And("I click on add list")
    public void iClickOnAddList() {
        
    }

    @Then("I see {string} on landing screen")
    public void iSeeOnLandingScreen(String arg0) {
    }
}
