Feature: Fields Functionality

  Background:User Login
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the Left Nav
      | setupOne   |
      | parameters |
      | Fields     |

  Scenario:Adding Fields
    And Click on the Plus Button
      | addButton1 |
    And Enter name and code
      | nameInput | Jhon Wick |
      | codeInput | 012627    |
    And Check if others can selected and select Field Type
    And Click on the translation button and check the functions
    And Click on the save button
      | saveButton |
    Then Success message should be displayed
      | addAssert | successfully created |

  Scenario:Adding Fields - Negative
    And Click on the Plus Button
      | addButton1 |
    And Enter name and code
      | nameInput | Jhon Wick |
      | codeInput | 012627    |
    And Click on the save button
      | saveButton |
    Then Success message should be displayed
      | addNegativeAssert | already exists |

  Scenario:Editing Fields
    And Enter name in search field
      | searchInput | Jhon Wick |
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

  Scenario:Deleting Fields - Negative
    And Enter name in search field
      | searchInput | Baba Yaga |
    And Click on the search button
      | searchButton |
    Then Warning message should be displayed
      | noDataAssert | no data to display |