package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LandingScreen;
import testUI.Configuration;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class LandingSteps {
    private LandingScreen landingScreen = new LandingScreen();

    @Given("I open the application")
    public void iOpenTheApplication() {
        landingScreen.checkLandingScreen("OurGHroceries", "RECIPES", "SHOPPING LIST");
    }

    @When("I click on add shopping list")
    public void iClickOnAddShoppingList() {
        landingScreen.clickAddShoppingList();
    }

    @And("I type {string}")
    public void iType(String arg0) {
        landingScreen.typeInShoppingName(arg0);
    }

    @And("I click on add list")
    public void iClickOnAddList() {
        landingScreen.clickOnAddList();
    }

    @Then("I see new list {string} on landing screen")
    public void iSeeOnLandingScreen(String arg0) {
        landingScreen.checkNewList(arg0);
        sleep(3000);
    }

    @Then("I check there is no {string}")
    public void iCheckThereIsNo(String arg0) {
        landingScreen.checkNoList(arg0);
    }

    @When("I open the shopping list {string}")
    public void iOpenTheShoppingList(String arg0) {
        landingScreen.goToShoppingList(arg0);
    }
}
