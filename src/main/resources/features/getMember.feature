Feature: calculate number of members each party should have
  As a system administrator
  I want to know number of members each party should have
  so that I can calculate number of member of party_list basis

  Background:
    Given Party with name A and vote counting 7900000 with number of members 97 exist
    And Party with name A and vote counting 7400000 with number of members 137 exist
    And Party with name B and vote counting 5900000 with number of members 30 exist
    And Party with name C and vote counting 3700000 with number of members 33 exist
    And Party with name D and vote counting 3500000 with number of members 39 exist

  Scenario: calculate members party A
    When calculate member party A
    Then total number for party should be 139

  Scenario: calculate members party B
    When calculate member party B
    Then total number for party should be 130

  Scenario: calculate members party C
    When calculate member party C
    Then total number for party should be 103
