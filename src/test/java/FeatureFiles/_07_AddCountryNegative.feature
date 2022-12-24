Feature: Add Country
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario: Add a Country Existent

    Given Navigate to Countries Setting Menu
      | setup       |
      | parameters  |
      | countries   |

    When Click The Add Button

    And Input The Country Informations
      | COUNTRY-T20-NEW  |
      | C-001-NEW        |

    And Click The Save Button

    Then Confirm The Error Message is Available

