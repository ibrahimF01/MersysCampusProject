Feature: Add, Edit And Delete Bank Accounts Functionality

  Background:
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

  Scenario: Adding a Bank Account
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog
      | nameInput       | ENPARA                      |
      | iban            | TR4400111000000001122334455 |
      | currency-select | TRY                         |
      | integrationCode | 112233                      |
    And Click on the element in the Dialog
      | saveButton |
    Then Successfully message should be displayed

  Scenario: Adding a Bank Account Negative
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog
      | nameInput       | INPARA                      |
      | iban            | TR4400111000000001122334455 |
      | currency-select | TRY                         |
      | integrationCode | 112233                      |
    And Click on the element in the Dialog
      | saveButton |
    Then Already exists massage should be displayed

  Scenario: Editing The Bank Account
    And User Edit item from Dialog
      | searchName | ENPARA |
      | nameInput  | ONPARA |
    And Click on the element in the Dialog
      | saveButton |
    Then Successfully message should be displayed

  Scenario: Deleting The Bank Account
    And User Delete item from Dialog
      | ONPARA |
    Then Successfully message should be displayed

