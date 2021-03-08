Feature: POCTest Feature
  Verify if user is able to launch a chrome browser and open a site

  Scenario: First basic test scenario
    Given Open google chrome
    And Navigate to website
    Then Site is launched successfully