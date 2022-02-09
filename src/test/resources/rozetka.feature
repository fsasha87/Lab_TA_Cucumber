Feature: I want to test website rozetka

  Scenario: I want to throw commodity with specified brand to bucket
    Given I go to rozetka page
    When I type category "Laptop"
    And I select brand "Lenovo"
    And I throw to bucket the cheapest
    Then I check if I have enough money "50000"

  Scenario Outline: I want to throw commodity with specified brand to bucket (DDT with BDD)
    Given I go to rozetka page
    When I type category "<category>"
    And I select brand "<brand>"
    And I throw to bucket the cheapest
    Then I check if I have enough money "<amount>"

    Examples:
      | category     | brand   | amount |
      | Телевизоры   | Samsung | 50000  |
      | Автошины     | Nokian  | 50000  |
      | Ванны        | Ravak   | 50000  |
      | Ноутбуки     | HP      | 50000  |
      | Холодильники | Bosch   | 50000  |
