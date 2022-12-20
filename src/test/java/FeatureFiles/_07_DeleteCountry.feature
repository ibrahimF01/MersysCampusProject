Feature: Add Country

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario: Delete a Country

    Given Navigate to Countries Setting Menu
      | setup       |
      | parameters  |
      | countries   |

    When Search The Country Informations
      | COUNTRY-T20-NEW  |
      | C-001-NEW        |

    And Click On The First Country Name Found

    And Click The Delete Button

    And Check The Country Informations to Delete
      | COUNTRY-T20-NEW  |
      | C-001-NEW        |

    And Click The Delete Button On CheckBox

    And Search The Country Informations
      | COUNTRY-T20-NEW  |
      | C-001-NEW        |

    Then Confirm The Country Informations is Not Available
      | COUNTRY-T20-NEW  |
      | C-001-NEW        |
