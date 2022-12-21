Feature: Field Settings Functionality

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    @Regression_HY
  Scenario Outline: Editing All Field Settings

    Given Navigate to Field Setting page
    When Choose "<Entity>" Type, activate two toggle bars and click Edit button
    And Set Order value, disable the toggle bars, activate the next toggle bar and assign a value
    Then User should edit all successfully

    Examples:
      | Entity        |
      | fSet_employee |
      | fSet_student  |

