Feature: Field Settings Functionality

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Editing All Field Settings
    Given Navigate to Field Setting page
    When Choose Student as Entity and click Edit button
    And Set Order value and activate Required Enabled and Array options
    Then User should edit all successfully

  Scenario: Editing All Field Settings2
    Given Navigate to Field Setting page
    When Choose Employee as Entity and click Edit button
    And Set Order value and activate Required Enabled and Array options
    Then User should edit all successfully

