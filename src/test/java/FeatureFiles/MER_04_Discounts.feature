Feature: Discounts Functionality

  Background: Log in to the Campus App > Discounts
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Click the headers under Left Navigation Bar
      | setupOne   |
      | parameters |
      | discounts  |

  Scenario:Creating a new record of Discounts
    When Click the following
      | addButton |

    And Fill in the following fields
      | description | Desc_hy |
      | intCode     | Code_hy |
      | priority    | 10      |

    And Click the toggle bar and Save button
      | active     |
      | saveButton |

    Then Status message should appear on the screen
      | successMessage | successfully |

  Scenario:Creating a new record of Discounts - Negative
    When Click the following
      | addButton |

    And Fill in the following fields
      | description | Desc_hy |
      | intCode     | Code_hy |
      | priority    | 10      |

    And Click the toggle bar and Save button
      | active     |
      | saveButton |

    Then Status message should appear on the screen
      | failureMessage | already exists |

  Scenario: Editing the record
    When Fill in the following fields
      | descriptionSearch | Desc_hy |
      | intCodeSearch     | Code_hy |

    And Click the following
      | searchButton |
      | editButton   |

    And Click the translation button and check the functions

    And Fill in the following fields
      | description | Desc_hy1 |
      | intCode     | Code_hy1 |
      | priority    | 11       |

    And Click the toggle bar and Save button
      | active     |
      | saveButton |

    Then Status message should appear on the screen
      | successMessage | successfully |

  Scenario: Deleting the record
    When Fill in the following fields
      | descriptionSearch | Desc_hy1 |
      | intCodeSearch     | Code_hy1 |

    And Click the following
      | searchButton    |
      | deleteButton    |
      | deleteDialogBtn |

    Then Status message should appear on the screen
      | successMessage | successfully |

  Scenario: Deleting the record - Negative
    When Fill in the following fields
      | descriptionSearch | Desc_hy1 |

    And Click the following
      | searchButton |

    Then Status message should appear on the screen
      | noData | no data to display |



