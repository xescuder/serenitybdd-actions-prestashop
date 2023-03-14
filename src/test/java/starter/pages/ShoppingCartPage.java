package starter.pages;

import org.openqa.selenium.By;

public class ShoppingCartPage {

    public static By CART_TOGGLE_LOCATOR = By.id("cart-toogle");

    public static By CART_LOCATOR = By.xpath("//a[text()='Cart']");

    public static By CART_ITEMS_LOCATOR = By.cssSelector("ul.cart-items li.cart-item");

    public static By CART_ITEM_NAME_LOCATOR = By.cssSelector(".product-line-info a");

    public static By CART_ITEM_QUANTITY_LOCATOR = By.cssSelector(".js-cart-line-product-quantity");

}