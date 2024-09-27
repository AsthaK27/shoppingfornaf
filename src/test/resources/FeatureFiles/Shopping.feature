Feature: Shopping for Nafisa's family

  Scenario: Purchase gifts for Nafisa's family within the budget
    Given Nafisa has registered and logged into the shopping site
    When Nafisa adds items to the cart for her brother, his wife, and their nieces
    And Nafisa proceeds to checkout
    Then the total amount should be between Rs 8000 and Rs 10000
    And Nafisa should be able to download the invoice
