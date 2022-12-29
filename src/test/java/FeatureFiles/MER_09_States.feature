Feature: States Functionality

  Background:
    And Click on the Left Nav
      | setupOne   |
      | parameters |
      | States     |

  Scenario: Adding States
    And Click on the Plus Button
      | addButton1 |
    And Select country
      | CountrySelect |
      | UkraineSelect |
    And Enter name and short name
      | nameInput | Jhon Wick |
      | shortName | Jhon      |
    And Click on the plus button
    And Check country add functions
    And Click on the translation button and check the functions
    And Click on the save button
      | saveButton |
    Then Success Message should be displayed
      | succesMessage | successfully |

  Scenario: Adding States - Negative
    And Click on the Plus Button
      | addButton1 |
    And Select country
      | CountrySelect |
      | UkraineSelect |
    And Enter name and short name
      | nameInput | Jhon Wick |
      | shortName | Jhon      |
    And Click on the save button
      | saveButton |
    Then Success Message should be displayed
      | negativeMessage | already exists |

  Scenario: Editing States
    And Enter the name to search
      | searchNameInput | Jhon Wick |
    And Click on the search button
      | searchButton |
    And Click on the edit button
      | editButton |
    And Edit name and short name
      | nameInput | Baba Yaga |
      | shortName | Baba      |
    And Click on the save button
      | saveButton |
    Then Success Message should be displayed
      | succesMessage | successfully updated |

  Scenario: Deleting States
    And Enter the name to search
      | searchNameInput | Baba Yaga |
    And Click on the search button
      | searchButton |
    And Click on the delete button
      | deleteButton |
    And Click on the delete button to delete
      | deleteAccept |
    Then Success Message should be displayed
      | succesMessage | successfully deleted |

  Scenario: Deleting States - Negative
    And Enter the name to search
      | searchNameInput | Baba Yaga |
    And Click on the search button
      | searchButton |
    Then Warning message should be displayed
      | noDataAssert | no data to display |