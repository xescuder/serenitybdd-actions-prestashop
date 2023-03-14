package starter.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;
import starter.pages.ProductArticle;
import starter.pages.ShoppingCartPage;
import java.util.Optional;
import static java.lang.Integer.parseInt;

public class ShoppingCart extends UIInteractionSteps {
    public void showCart() {
        $(ShoppingCartPage.CART_TOGGLE_LOCATOR).click();
        $(ShoppingCartPage.CART_LOCATOR).click();
    }
    public void addProduct() {
       $(ProductArticle.ADD_TO_CART).waitUntilEnabled().click();
    }

    public int getProductQuantity(String name) {
        WebElement element = findProductByName(name);
        return parseInt(element.findElement(ShoppingCartPage.CART_ITEM_QUANTITY_LOCATOR).getAttribute("value"));
    }

    private WebElement findProductByName(String name) {
        Optional<WebElementFacade> productArticle = findAll(ShoppingCartPage.CART_ITEMS_LOCATOR).stream().filter(elem -> elem.findElement(ShoppingCartPage.CART_ITEM_NAME_LOCATOR).getText().equals(name)).findFirst();
        return productArticle.orElse(null);
    }
}