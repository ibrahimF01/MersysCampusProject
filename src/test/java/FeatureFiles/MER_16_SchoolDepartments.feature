  Feature: School Departments Functionality

    Background:
      When Click the following under Left Navigation Bar
        | setupOne    |
        | schoolSetup |
        | departments |
      Then Validating element or message should be displayed
        | school_Dept | School Departments |


    Scenario:Creating a School Department

      When Click the button or element following
        | addButton |
      And Fill in the next fields
        | nameInput | Science_Dept |
        | codeInput | SD_10        |
      And Drag the toggle bar
        | active |

      And Click the next header and its first row element
        | section    |
        | plusButton |
      And Fill in the next fields
        | nameInput | Physics_Sect |
        | shortName | Phys_S       |
      And Drag the toggle bar
        | active |
      And Click the in-box Add button
        | addButton_inBox |

      And Click the next header and its first row element
        | dept_Constants |
        | plusButton     |
      And Fill in the Dept.Constant fields
        | key_Constant   | Experiment |
        | value_Constant | Ex_10      |
      And Click the in-box Add button
        | addButton_inBox |

      And Click the button or element following
        | saveButton |
      Then Validating element or message should be displayed
        | successMessage | successfully created |


    Scenario: Creating a School Department - Negative
      When Click the following
        | addButton |
      And Fill in the next fields
        | nameInput | Science_Dept |
        | codeInput | SD_10        |
      And Click the button or element following
        | saveButton |
      Then Validating element or message should be displayed
        | failureMessage | There is already Department |


    Scenario: Editing the School Department
      When Click the button or element following
        | Science_Dept |
      And Fill in the next fields
        | nameInput | Art_Dept |
        | codeInput | AD_10    |
      And Drag the toggle bar
        | active |

      And Click the next header and its first row element
        | section      |
        | Physics_Sect |
      And Fill in the next fields
        | nameInput | Literature_Sect |
        | shortName | Lit_S           |
      And Drag the toggle bar
        | active |
      And Click the in-box Add button
        | editButton_inBox |

      And Click the next header and hover over plus button

      And Fill in the Dept.Constant fields
        | key_Constant   | Reading_Const |
        | value_Constant | Rd_10   |
      And Click the in-box Add button
        | editButton_inBox |

      And Click the button or element following
        | saveButton |
      Then Validating element or message should be displayed
        | successMessage | successfully updated |

    Scenario: Deleting the School Department
      When Click the button or element following
        | Art_Dept        |
        | section         |
        | delete_Sect     |
        | deleteDialogBtn |

      And Click the dept.Constants and hover over Plus button so that rows are displayed, then delete the selected row element and click Save

      And Click the button or element following
        | delete_Dept    |
        | deleteDialogBtn |
      Then Validating element or message should be displayed
        | successMessage | successfully deleted |







