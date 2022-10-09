Feature: Datatable Example

  Scenario: Verify My Info Module
    Given launch OrangeHRM login page
    When Enter valid username and password and hit enter
      | Admin | admin123 |
      | admin | Admin123 |
    When Click on My Info module
    Then verify My Info module should load
    Then close Browser
