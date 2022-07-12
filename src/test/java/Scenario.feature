Feature: Find restaurant and put the pizza in the basket and account
  #Позитивный сценарий
    Scenario: chose restaurant city and put on basket
    Given url of restaurant
    Then chose city 'Москва'
    And click on basket

#Негативный сценарий
    Scenario: chose restaurant city log into your account
    Given url of restaurant
    Then chose city 'Москва'
    And click to login to your account
    And keep a phone number

