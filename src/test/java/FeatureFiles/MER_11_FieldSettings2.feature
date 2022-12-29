Feature: Field Settings Functionality

  Scenario Outline: Editing All Field Settings

    Given Navigate to Field Setting menu
      | setupOne      |
      | parameters    |
      | fieldSettings |

    When Select Entity Type, activate the following toggle bars and click Edit button
      | fSet_entityType |
      | <Entity Type>   |

      | fSet_required   |
      | fSet_enabled    |
      | fSet_edit1      |

    And Assign values for Order and Array fields
      | edit_order | 1 |

    And Disable the two toggle bars, enable the last toggle bar
      | edit_required |
      | edit_enabled  |
      | edit_array    |

    And Assign values for Order and Array fields
      | edit_arrayValues | 100 |

    And Click Save button
      | saveButton |

    Then Success message should appear on the screen
      | successMessage | successfully updated |

    Examples:
      | Entity Type   |
      | fSet_employee |
      | fSet_student  |

