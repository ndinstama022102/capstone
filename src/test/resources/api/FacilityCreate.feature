Feature: Facility_Create

  Scenario: As a user I want to create new facility with enter a new facility
    Given I success create facility
    When I request POST for create facility with authorization and name facility
    Then I validate the status code 200
    And I validate the response message
