Feature: Discounts Functionality

  Background:
    When Click the headers under Left Navigation Bar
      | setupOne   |
      | parameters |
      | discounts  |

  @Regression_hy
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

  @Regression_hy
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

  @Regression_hy
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

  @Regression_hy
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

  @Regression_hy
  Scenario: Deleting the record - Negative
    When Fill in the following fields
      | descriptionSearch | Desc_hy1 |

    And Click the following
      | searchButton |

    Then Status message should appear on the screen
      | noData | no data to display |



