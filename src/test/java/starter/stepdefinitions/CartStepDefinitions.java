package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.interactions.NavigateTo;
import starter.interactions.ShoppingCart;
import starter.interactions.SearchFor;
import starter.interactions.SearchResult;
import static org.assertj.core.api.Assertions.assertThat;

public class CartStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Steps
    ShoppingCart shoppingCart;


    @Given("^(?:.*) has an empty basket")
    public void i_have_an_empty_basket() {
        navigateTo.theHomePage();
    }

    @When("he/she adds the item {string} to shopping cart")
    public void i_add_item_found_to_shopping_cart(String productName) {
        searchFor.term(productName);
        searchResult.seeProductArticle(productName);
        shoppingCart.addProduct();
    }

    @Then("he/she should see the {string} in the cart with quantity {int}")
    public void i_should_see_the_item_in_the_cart(String item, int quantity) {
        shoppingCart.showCart();
        assertThat(shoppingCart.getProductQuantity(item)).isEqualTo(quantity);
    }
}

