Feature: Test Google search functionality

  Scenario: Validate google search is working

    Given user is on google page
    When user enters 'skillfactory' in search box
    And click on search button
    Then  user is navigated to search results
    Then click on sait 'skillfactory'
