Feature: Add products to basket

  Scenario: Adding a new product item to empty basket
    Given Xavier is searching products
    When he looks up "Navitim"
    And he opens the first item found "Navitimer"
    And he adds the item to shopping cart
    Then he should see the "Navitimer" in the cart with quantity 1