Feature: Website Traveloka
  Scenario: User search flight to Padang
    Given User open browser and url
    When User click flight
    And User click one way around
    And User select departure
    And User select destination
    And User fill in departure date
    And User click button search flight
    Then User chooses a flight and click choose button

