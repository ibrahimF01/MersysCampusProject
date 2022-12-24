Feature: Countries Settings Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    And User should login successfully
    Then Navigate to Countries Setting Menu
      | clickSetup       |
      | clickParameters  |
      | clickCountries   |

  Scenario: Add a Country
    When Click The Add Button
    And InputForm The Country Informations
          | COUNTRY-T20 |
          | C-001       |
    And Click The Save Button
    Then Confirm The Message
          | SuccessMessage  |
          | successfully    |

  Scenario: Add a Country Existent
    When Click The Add Button
    And InputForm The Country Informations
          | COUNTRY-T20 |
          | C-001       |
    And Click The Save Button
    Then Confirm The Message
          | ExistMessage    |
          | already exists  |

  Scenario: Update a Country
    When Input The Country Informations
      | COUNTRY-T20  |
      | C-001        |
    And Click The Search Button
    And Click On The First Country Name Found
    And InputForm The Country Informations
      | COUNTRY-T20-NEW  |
      | C-001-NEW        |
    And Click The Save Button
    Then Confirm The Message
      | SuccessMessage  |
      | successfully    |

  Scenario: Delete a Country
    When Input The Country Informations
      | COUNTRY-T20-NEW  |
      | C-001-NEW        |
    And Click The Search Button
    And Click The Delete Button
    And Click On The FormDelete Button
    Then Confirm The Message
      | SuccessMessage  |
      | successfully    |
