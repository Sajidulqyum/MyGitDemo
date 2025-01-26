
Feature: Place the order for the products

@checkoutproducts
  Scenario Outline: Search experiance for products for both the home and offer page
    Given User is on GreenCard landing page
    When User searched with <Name> and extracted actual name of the product
    And Added "3" items of the selected product to the cart
    Then User proceed to checkout and validate the <Name> items in the checkout page
    And verify user has the ability to enter the promo code and place the order

Examples: 
| Name |
| Tom	 |




