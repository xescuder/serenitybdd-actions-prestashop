package starter.search;

import org.openqa.selenium.By;

public class ProductArticle {
    static final String PRODUCT_LOCATOR = "//h3//a[contains(text(), '%s')]";

    static By ADD_TO_CART = By.cssSelector("div.add > button");
}