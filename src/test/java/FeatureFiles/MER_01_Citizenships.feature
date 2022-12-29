Feature: Citizenships Page functionality

  Scenario: User should be able to create new citizionships with required informations
    Given Click on the Citizenship tab
    When New country must be registered
    Then Description success message should be displayed

  Scenario: User should be able to update an existant citizenship
    Given Click on the Citizenship tab
    When country registration must be changed
    Then Description success message should be displayed

  Scenario: When the user is searching for the country, distinguishing capital letters should find your country
    Given Click on the Citizenship tab
    When Search should be made with uppercase and lowercase letters.
    Then verify that the country is listed on the screen

  Scenario:When registering a new country, the user should not be able to re-register the previously registered country.
    Given Click on the Citizenship tab
    When  A registered country must be re-registered
    Then  Verify that the registration was unsuccessful

  Scenario:When a user enrolls in a new country, capitalization should confirm that your double enrollment is not allowed.
    Given Click on the Citizenship tab
    When  must be re-registered using a registered country spell and lowercase
    Then  Verify that the registration was unsuccessful

  Scenario: User should be able to delete an existant citizenship
    Given Click on the Citizenship tab
    When registered country must be deleted
    Then Description success message should be displayed

  Scenario: User should not be able to delete non existant citizenship
    Given Click on the Citizenship tab
    When -Non-existing country should be written in the search field.
    Then Verify that the country is not on the list

