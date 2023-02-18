Feature: Login Functionality tests

  @validLogin

  Scenario: Login with valid credential
    Given the user is on the login page
    When the user enter valid username
    And the user enter valid passwors
    And  the user clicks to log in button
    Then  the user should be able to log in
