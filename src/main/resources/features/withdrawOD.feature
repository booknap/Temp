Feature: withdraw
    As the bank
    I want to withdraw from OD account using ATM

Background:
    Given a developer with id 1 and pin 111 with balance 500 exists in account type OD
    And I login to ATM with id 1 and pin 111

Scenario: Withdraw amount less than balance in OD account
    When I withdraw 50 from ATM
    Then my account balance is 450

Scenario: Withdraw amount more than balance in OD account
    When I overdraw 5000 from ATM
    Then my account balance is -4500