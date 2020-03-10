Feature: Searching the products in ikoala.com

  Scenario Outline: To search five products in search box
    Given website should be loggged in
    When search the products "<prdname>"
    Then click the go button

    Examples: 
      | prdname   |
      | men shoes |
      | iphone    |
      | fashion   |
      | toys      |
