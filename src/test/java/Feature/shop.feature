Feature: Shop Veggies

#  Scenario:Search vegetable
#   Given user will navigate to website
#    And user will click on the search bar
#    Then user will enter "cucumber"
#    When user click search
#    Then cucumber will be displayed
#    Then take a screenshot

#   Scenario Outline: search for items and add to card
#    Given user will navigate to website
#    And user will click on the search bar
#    Then user will enter "<vegetable>"
#    And user click search
#    Then "<vegetable>" will be displayed
#    And user will add in to card
#    Then user will navigate to cart
#    And verify "<vegetable>" in the cart
#    Then take a screenshot
#    Examples:
#    |vegetable|
#     |Cucumber|
#     |Tomato|
#     |Beetroot|
#     |Beans|
#     |Capsicum|

 Scenario: all all items to the cart
  Given user will navigate to website
  And user will add all list to the card
  Then user will navigate to cart
  Then take a screenshot
