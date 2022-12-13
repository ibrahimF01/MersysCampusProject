Feature: Field Settings Functionality

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario: Editing All Field Settings

    Given Navigate to Field Setting page
    When Choose an Entity Type and click Edit button
    And Set Order value and activate Required Enabled and Array options
    Then User should edit all successfully
