Feature:Nationalities Functionality

  Scenario Outline: Nationalities Page Functionality

    Given Navigate to Nationalities Page functionality
    When Create "<NationName>" new Nationalites
    Then Success massage should be displayed

    When Cannot create a Nationality with the same name "<NationName>"
    Then Already exists massage should be shown

    When Update an existent Nationality "<NationName>"
    And Edit Nationality "<editNationName>"
    Then Success massage should be displayed

    When Cancel Delete Nationality "<editNationName>"

    When Delete Nationality "<editNationName>"
    Then Success massage should be displayed

    Examples:
      | NationName | editNationName |
      | Campus     | CampusTest     |


