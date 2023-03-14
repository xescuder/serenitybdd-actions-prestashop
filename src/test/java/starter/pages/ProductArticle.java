package starter.pages;

import org.openqa.selenium.By;

public class ProductArticle {
    public static final String PRODUCT_LOCATOR = "//h3//a[contains(text(), '%s')]";
    public static By ADD_TO_CART = By.cssSelector("div.add > button");
}