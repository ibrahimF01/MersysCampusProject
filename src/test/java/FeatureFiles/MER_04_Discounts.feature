Feature: Discounts Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the headers under Left Navigation Bar
      | setupOne   |
      | parameters |
      | discounts  |

  Scenario:Creating a new Discount record
    When Click on the following
      | addButton |

    And Fill in the following fields
      | description | Desc_hy |
      | intCode     | Code_hy |
      | priority    | 10      |

    And Click on the toggle bar and Save button
      | active     |
      | saveButton |

    Then Status message should come out on the screen
      | successMessage | successfully |

  Scenario:Creating a new Discount record - Negative
    When Click on the following
      | addButton |

    And Fill in the following fields
      | description | Desc_hy |
      | intCode     | Code_hy |
      | priority    | 10      |

    And Click on the toggle bar and Save button
      | active     |
      | saveButton |

    Then Status message should come out on the screen
      | failureMessage | already exists |

  Scenario: Editing the record
    When Fill in the following fields
      | descriptionSearch | Desc_hy |
      | intCodeSearch     | Code_hy |

    And Click on the following
      | searchButton |
      | editButton   |

    And Click on the translation button and check the functions

    And Fill in the following fields
      | description | Desc_hy1 |
      | intCode     | Code_hy1 |
      | priority    | 11       |

    And Click on the toggle bar and Save button
      | active     |
      | saveButton |

    Then Status message should come out on the screen
      | successMessage | successfully |

  Scenario: Deleting the record
    When Fill in the following fields
      | descriptionSearch | Desc_hy1 |
      | intCodeSearch     | Code_hy1 |

    And Click on the following
      | searchButton    |
      | deleteButton    |
      | deleteDialogBtn |

    Then Status message should come out on the screen
      | successMessage | successfully |

  Scenario: Deleting the record - Negative
    When Fill in the following fields
      | descriptionSearch | Desc_hy1 |

    And Click on the following
      | searchButton |

    Then Status message should come out on the screen
      | noData | no data to display |



