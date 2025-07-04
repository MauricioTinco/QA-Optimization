Feature: Login

  Scenario: Successful login
    Given the user prepares the login API
    When the user sends the login request
    Then the response code should be 200
