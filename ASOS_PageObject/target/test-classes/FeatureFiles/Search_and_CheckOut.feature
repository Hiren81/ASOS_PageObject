Feature: complete checkout functionality
Scenario Outline: Search Product Adidas Product
Given user is on HomePage
When user enter "<product>" name and click submit
Then user select the product
Then user enter the "<size>" details
Then user click add to Bag
Then user check the shpooing Bag
Then user check out
Examples:
|product|size|
|Adidas | UK 8|

  Scenario: home page test
    Given user is on "HomePage"

  Scenario: home page test1
    Given user is on "GoodPage"

