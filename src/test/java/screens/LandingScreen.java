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


    // Methods
    public void clickAddShoppingList() {
        shoppingListInput.click();
    }

    public void typeInShoppingName(String var) {
        inputShoppingList.sendKeys(var);
    }

    public void clickOnAddList() {
        addListButton.shouldHave().attribute("text").equalTo("ADD LISTS");
        addListButton.click();
    }

    public void checkNewList(String arg) {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
    }
}
