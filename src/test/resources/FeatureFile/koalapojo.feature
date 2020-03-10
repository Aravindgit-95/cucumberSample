Feature: To validate the ikoala application

  Background: 
    Given user should launch the browser
    And user should log in the app
      | username | aravindswaami@gmail.com |
      | password | Aravind@123             |
  @Smoke
  Scenario: To verify the search box of the app
    When user should enter the values in src box
      | shoes   | iphones | gifts     |
      | fashion | toys    | furniture |
    Then user clicks the go button
 @Sanity @Regression
  Scenario Outline: To verify the Search Box randomly
    When user enter the values randomly "<Shampoo>"
    Then user will click the go button

    Examples: 
      | Shampoo |
      | flowers |
      | dress   |
      | cars    |
