package starter.stepdefinitions;

import io.cucumber.java.en.And;
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


    @Given("^(?:.*) is searching products")
    public void i_am_on_the_prestashop_home_page() {
        navigateTo.theHomePage();
    }

    @When("he/she looks up {string}")
    public void i_search_for(String term) {
        searchFor.term(term);
    }

    @And("he/she opens the first item found {string}")
    public void i_open_first_item_found(String productName) {
        searchResult.seeProductArticle(productName);
    }

    @And("he/she adds the item to shopping cart")
    public void i_add_item_found_to_shopping_cart() {
        shoppingCart.addProduct();
    }

    @Then("he/she should see the {string} in the cart with quantity {int}")
    public void i_should_see_the_item_in_the_cart(String item, int quantity) {
        shoppingCart.showCart();
        assertThat(shoppingCart.getProductQuantity(item)).isEqualTo(quantity);
    }
}

