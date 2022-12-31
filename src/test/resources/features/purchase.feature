Feature: The user should be able to place order from the website

  Background: Go to home page
    Given The user is on the login page

    @wip
    Scenario: Placing a successful order
      When The user enters with "etsB3" and "Test123+" credentials
      And The user adds "Samsung galaxy s7" from "Phones"
      And The user adds "Sony vaio i5" from "Laptops"
      And The user adds "MacBook air" from "Laptops"
      And The user adds "Apple monitor 24" from "Monitors"
      And The user removes "Sony vaio i5" from cart
      And The user places order and captures and log amount
      Then The user verifies purchase amount equals 1