Feature: Add Country

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario: Rename a Country Name Existent

    Given Navigate to Countries Setting Menu
      | setup       |
      | parameters  |
      | countries   |

    When Search The Country Informations
      | COUNTRY-T20-NEW |
      | C-001-NEW       |

    And Click On The First Country Name Found

    And Input The Country Informations
      | TURKEY    |
      | TUR       |

    And Click The Save Button

    Then Confirm The Error Message is Available
