Feature: Testing Expertrons application

  Scenario: Testing Expertrons Login functionality for valid user
    Given User is already haveing application URL
    And user enter valid mobile numberer
    When user enter Generate otp
    And clicks on login button
    Then Expertrons home page will be displayed
