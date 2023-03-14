package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.cart.ShoppingCart;

public class ShoppingCartSteps extends UIInteractionSteps {
    public void addProductArticle() {
        $(ProductArticle.ADD_TO_CART).waitUntilEnabled().click();
    }


    public void showCart() {
        $(ShoppingCart.CART_TOGGLE_LOCATOR).click();
        $(ShoppingCart.CART_LOCATOR).click();
    }
}