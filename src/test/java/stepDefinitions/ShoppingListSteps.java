package stepDefinitions;

import cucumber.api.java.en.When;
import screens.ShoppingListScreen;

public class ShoppingListSteps {
    private ShoppingListScreen screen = new ShoppingListScreen();

    @When("I remove the list {string}")
    public void iRemoveTheList(String arg0) {
        screen.checkShoppingList(arg0).removeList().checkNoList(arg0);
    }
}
