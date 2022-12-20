Feature: Fees Functionality

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Adding new Fees

    Given Navigate to Fees Functionality
      | setupOne   |
      | parameters |
      | fees       |

    When Adding a new fee
      | nameInput       | Arturo Bandini |
      | codeInput       | Bandi01        |
      | IntegrationCode | 2727           |
      | priorityInput   | 999            |

    Then Success message should be displayedd

  Scenario: Editing last Fees

    Given Navigate to Fees Functionality
      | setupOne   |
      | parameters |
      | fees       |

    When Search Last Fees
      | searchInputOne | Arturo Bandini |
      | searchInputTwo | Bandi01        |

    And Update it
      | nameInput       | Arturo Nurmagedov |
      | codeInput       | Nurma01           |
      | IntegrationCode | 5555              |
      | priorityInput   | 1111              |

    Then Success message should be displayedd

  Scenario: Delete last Fees

    Given Navigate to Fees Functionality
      | setupOne   |
      | parameters |
      | fees       |

    And User delete item from Dialog
      | searchInputOne | Arturo Nurmagedov |
      | searchInputTwo | Nurma01        |

    Then Success message should be displayedd









