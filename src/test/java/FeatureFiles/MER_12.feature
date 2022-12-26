Feature: Add, Edit And Delete Bank Accounts Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne |
      | parameters |
      | bankAccounts |

  Scenario: Adding a Bank Account
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog
      | nameInput | Enpara |
      | iban | TR4400111000000001122334455 |
      | currency-select | TRY |
      | integrationCode | 112233 |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Editing The Bank Account
    And User Edit item from Dialog
      | searchName | ENPARA |
      | nameInput | ONPARA |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: Deleting The Bank Account
    And User Delete item from Dialog
      | searchName | ONPARA |
    Then Success message should be displayed