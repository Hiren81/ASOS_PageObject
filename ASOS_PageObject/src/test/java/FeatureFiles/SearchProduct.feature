Feature: Search product on ASOS.com

  Scenario: Search Product
    Given user is on Home Page
    When user enter product name
    And click submit
    Then user can see the product

  Scenario: Join ASOS
    Given user is on Home Page
    When user click join button
    And enter detials and submit
    Then user account created

  Scenario: Join ASOS user data
    Given user is on Home Page
    When user click join button
    And enter detials from table and submit
      | Fields                 | Values              |
      | Email Address          | tom@someone.com     |
      | First Name             | Tom                 |
      | Last Name              | Kenny               |
      | Password               | name#1245@@#        |
      | Birthdate-Date         | 10                  |
      | Birthdate-Month        | March               |
      | Birthdate-Year         | 1990                |
      | Gender                 | M                   |
    Then user account created


