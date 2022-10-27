Feature: The user wants to buy a cellphone by the page
  Scenario Outline: The user wants to log in
    Given the user is on the web page
    When the user enter a user and a password
      | user     | <user>     |
      | password | <password> |
    Then he see the item in the cart
    Examples:
      | user          | password          |
      | standard_user | secret_sauce |