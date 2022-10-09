Feature: Datatable Example2

  Scenario: Verify My Info Module
    Given launch OrangeHRM login page
    When Enter valid username and password and hit enter
      | UserName | Password |
      | Admin    | admin123 |
    When Click on My Info module
    Then verify My Info module should load
    Then close Browser
