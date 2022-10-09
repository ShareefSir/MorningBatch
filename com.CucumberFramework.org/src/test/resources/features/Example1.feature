Feature: validation of the OrangeHRM login

  Scenario: Verify Login Functionality
    Given launch OrangeHRM login page
    When Enter valid username and password and hit enter
    Then Verify OrangeHRM login success
    Then close Browser

  Scenario: Verify My Info Module
    Given launch OrangeHRM login page
    When Enter valid "Admin" and "admin123" and hit enter
    When Click on My Info module
    Then verify My Info module should load
    Then close Browser

  Scenario Outline: Verify My Info Module
    Given launch OrangeHRM login page
    When Enter valid "<UserName>" and "<Password>" and hit enter
    When Click on My Info module
    Then verify My Info module should load
    Then close Browser

    Examples: 
      | UserName | Password |
      | Admin    | admin123 |
      | admin    | admin123 |

  
