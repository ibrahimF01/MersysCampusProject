Feature: Add Country
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario: Add a Country

    Given Navigate to Countries Setting Menu
          | setup       |
          | parameters  |
          | countries   |

    When Click The Add Button

    And Input The Country Informations
          | COUNTRY-T20 |
          | C-001       |

    And Click The Save Button

    And Search The Country Informations
          | COUNTRY-T20  |
          | C-001        |

    And Confirm The Country Informations
          | COUNTRY-T20  |
          | C-001        |
