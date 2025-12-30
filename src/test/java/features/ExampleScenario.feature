Feature: Example Scenario

  Background:
    Given user is on login page

  Scenario Outline: go to web site and login test
    And user types username as "<username>"
    And user types password as "<password>"
    When click button
    Then assert to success

    Examples:
      |username|password|
      |student|Password123|

  Scenario: home page loading test
    Given go to home page
    When wait two seconds
    Then see "Hello" text
