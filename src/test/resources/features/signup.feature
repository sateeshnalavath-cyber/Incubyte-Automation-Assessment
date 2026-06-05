Feature: User Registration and Login

  Scenario: Create account and login successfully
    Given User launches Parabank application
    When User registers a new account
    Then User should see account overview page
    And User account balance should be displayed