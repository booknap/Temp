Feature: calculate the total vote
  As a system administrator
  I want to know the number of total vote

  Background:
    Given Party with name A and vote counting 7900000 with number of members 97 exist
    And Party with name B and vote counting 7400000 with number of members 137 exist
    And Party with name C and vote counting 5900000 with number of members 30 exist
    And Party with name D and vote counting 3700000 with number of members 33 exist
    And Party with name E and vote counting 3500000 with number of members 39 exist
    
  Scenario:
    When count all vote
    Then total vote for all party should be 28400000
