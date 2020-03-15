Feature: Login
  As user, I want to be able to login into vytrack
  under different roles with username and

  Scenario: Login as store manager
    Given user is on the landing page
    Then user logs in as store manager
    And User verifies that "Dashboard" page subtitle is displayed

  Scenario: Login as driver
    Given user is on the landing page
    Then user logs in as driver
    And User verifies that "Dashboard" page subtitle is displayed

  Scenario: Login as sale manager
    Given user is on the landing page
    Then user logs in as sale manager
    And User verifies that "Dashboard" page subtitle is displayed