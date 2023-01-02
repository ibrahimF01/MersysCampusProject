Feature: Fields Functionality

  Background:
    And Click on the Left Nav
      | setupOne   |
      | parameters |
      | Fields     |
  @Regression @SmokeTest
  Scenario:Adding Fields
    And Click on the Plus Button
      | addButton1 |
    And Enter name and code
      | nameInput | John Wick |
      | codeInput | 012627    |
    And Check if others can selected and select Field Type
    And Click on the translation button and check the functions
    And Click on the save button
      | saveButton |
    Then Success message should be displayed
      | addAssert | successfully created |
  @Regression
  Scenario:Adding Fields - Negative
    And Click on the Plus Button
      | addButton1 |
    And Enter name and code
      | nameInput | John Wick |
      | codeInput | 012627    |
    And Click on the save button
      | saveButton |
    Then Success message should be displayed
      | addNegativeAssert | already exists |
  @Regression
  Scenario:Editing Fields
    And Enter name in search field
      | searchInput | John Wick |
    And Click on the search button
      | searchButton |
    And Click on the edit button
      | editButton |
    And Edit name and code
      | nameInput | Baba Yaga |
      | codeInput | 262701    |
    And Click on the save button
      | saveButton |
    Then Success message should be displayed
      | editAssert | successfully updated |
  @Regression
  Scenario:Deleting Fields
    And Enter name in search field
      | searchInput | Baba Yaga |
    And Click on the search button
      | searchButton |
    And Click on the delete button
      | deleteButton |
    And Click on the delete button to delete
      | deleteAccept |
    Then Success message should be displayed
      | noDataAssert | no data to display |
  @Regression
  Scenario:Deleting Fields - Negative
    And Enter name in search field
      | searchInput | Baba Yaga |
    And Click on the search button
      | searchButton |
    Then Warning message should be displayed
      | noDataAssert | no data to display |