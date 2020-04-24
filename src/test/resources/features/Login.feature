Feature: Login
  As user, I want to be able to login into vytrack
  under different roles with username and

  # Any step that was implemented before can be reused
  # If test step has yellow background, that means it doesn't have implementation yet
  # click Ctrl + Alt + L to format the code, save like in Java

<<<<<<< HEAD
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
=======
  Background: open login page
    Given user is on the login page

  @sale_manager
  Scenario: Login as sales manager and verify that title is Dashboard
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

  @store_manager
  Scenario: Login as store manager and verify that title is Dashboard
    When user logs in as a store manager
    Then user should verify that title is a Dashboard

  @driver @dashboard
  Scenario: Login as driver and verify that title is Dashboard
    When user logs in as a driver
    Then user should verify that title is a Dashboard

    @login_with_params
    Scenario: Login with parameters
      When User enters "salesmanager115" username and "UserUser123" password
      Then user should verify that title is a Dashboard
>>>>>>> New Calendar Future File
