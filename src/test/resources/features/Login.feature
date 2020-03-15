Feature: Login
  As user, I want to be able to login into vytrack
  under different roles with username and

  # Any step that was implemented before can be reused
  # If test step has yellow background, that means it doesn't have implementation yet
  # click Ctrl + Alt + L to format the code, save like in Java

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