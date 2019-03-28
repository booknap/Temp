Feature: calculate the number of party-list member
  As a system administrator
  I want tot know the number of party-list member
  so that I can get the winner of the election

  Background:
    Given Party with name A and vote counting 7900000 with number of members 97 exist
    And Party with name A and vote counting 7400000 with number of members 137 exist
    And Party with name B and vote counting 5900000 with number of members 30 exist
    And Party with name C and vote counting 3700000 with number of members 33 exist
    And Party with name D and vote counting 3500000 with number of members 39 exist

  Scenario: calculate number of party-list member
    When calculate party-list member A
    Then party-list member for party should be 42
