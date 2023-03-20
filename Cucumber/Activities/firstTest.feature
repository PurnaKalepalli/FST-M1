Feature: Basic Syntax
  @First @SmokeTest
  Scenario: Scenario 1
    Given user is on TS page
    When user clicks on about us button
    Then user is redirected to the about us page
    Then close the browser