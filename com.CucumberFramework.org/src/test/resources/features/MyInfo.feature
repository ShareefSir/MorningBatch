Feature: Validation of the My Info epic

  Scenario: Verify My Info Module
    Given launch OrangeHRM login page
    When Enter valid username and password and hit enter
    When Click on My Info module
    Then verify My Info module should load
    Then close Browser
