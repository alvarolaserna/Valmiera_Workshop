package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.byAndroidUIAutomator;
import static testUI.Utils.By.byId;
import static testUI.elements.TestUI.E;



public class LandingScreen {
    // Elements
    private final UIElement shoppingListInput =
            E(byAndroidUIAutomator("textContains(\"Add a shopping list\")"));
    private final UIElement inputShoppingList = E(byId("editText"));
    private final UIElement addListButton = E(byId("android:id/button1"));
    private final UIElement groceries =
            E(byAndroidUIAutomator("textContains(\"OurGroceries\")"));
    private final UIElement shoppingListTitle =
            E(byAndroidUIAutomator("textContains(\"SHOPPING LIST\")"));
    private final UIElement recipesTitle =
            E(byAndroidUIAutomator("textContains(\"RECIPES\")"));
    private final UIElement addRecipe =
            E(byAndroidUIAutomator("textContains(\"Add a recipe...\")"));


    // Methods
    public LandingScreen checkLandingScreen(String... args) {
        for (String arg : args) {
            UIElement element =
                    E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
            element.waitFor(5).untilIsVisible();
        }

        return this;
    }

    public void clickAddShoppingList() {
        shoppingListInput.click();
    }

    public void typeInShoppingName(String var) {
        inputShoppingList.sendKeys(var);
    }

    public void clickOnAddList() {
        addListButton.shouldHave().attribute("text").equalTo("ADD LIST"); // Changed from ADD LISTS to ADD LIST
        addListButton.click();
    }

    public void checkNewList(String arg) {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
    }

    public void goToShoppingList(String list) {
        E(byAndroidUIAutomator("text(\"" +list+"\")")).waitFor(5).untilIsVisible().click();
    }

    //Method to check if the list was deleted correctly
    public void checkNoList(String arg) {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilNotVisible();
    }
}
