Feature: Find restaurant
  #Позитивный сценарий
  Scenario: chose restaurant city
    Given url of restaurant
    Then chose city 'Москва'
   And assert that chose city is 'Москва'
#Негативный сценарий
  Scenario: chose absent city
    Given url of restaurant
    Then chose city 'Балтимор'
 And assert that user got message 'Пиццерия в этом городе еще не открылась'