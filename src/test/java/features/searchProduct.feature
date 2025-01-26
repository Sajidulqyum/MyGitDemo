
Feature: Search and place the order for the products

@searchandplaceproducts 
  Scenario Outline: Search experiance for products for both the home and offer page
    Given User is on GreenCard landing page
    When User searched with <Name> and extracted actual name of the product
    Then User searched for <Name> in offers page 
    And validate if the product matches

Examples: 
| Name |
| Tom	 |
| Beet |


