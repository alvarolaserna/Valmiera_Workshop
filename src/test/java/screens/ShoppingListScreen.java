

package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class ShoppingListScreen {
    // Elements
    private UIElement settingsButton = E(byAccesibilityId("More options"));
    private UIElement deleteOption = E(byAndroidUIAutomator("textContains(\"Delete list\")")); //Changed to Delete list
    private UIElement confirmDelete = E(byId("android:id/button1")); // Fixed syntax error
    private UIElement backArrow = E(byAccesibilityId("Navigate up"));
    private UIElement barCode = E(byId("menu.ScanBarcode"));
    private UIElement plusButton = E(byId("menu.AddItem"));
    private UIElement addItemInput = E(byId("android:id/text1"));


    // Methods
    public ShoppingListScreen checkShoppingList(String list) {
        settingsButton.waitFor(5).untilIsVisible();
        backArrow.waitFor(5).untilIsVisible();
        barCode.waitFor(5).untilIsVisible();
        plusButton.waitFor(5).untilIsVisible();
        addItemInput.waitFor(5).untilIsVisible();
        E(byAndroidUIAutomator("text(\"" +list+ "\")")).waitFor(5).untilIsVisible();

        return this;
    }

    public LandingScreen removeList() {
        settingsButton.click();
        deleteOption.click();
        confirmDelete.click();

        return new LandingScreen();
    }

}
