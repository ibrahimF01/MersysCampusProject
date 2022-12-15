Feature: Field Settings Functionality

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Editing All Field Settings

    Given Navigate to Field Setting page
    When Choose "<Entity>" Type and click Edit button
    And Set Order value and activate Required Enabled and Array options
    Then User should edit all successfully

    Examples:
      | Entity        |
      | fSet_employee |
      | fSet_student  |

