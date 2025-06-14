Feature: login function
  Scenario: user login with right username and password
    Given user open browser
    And user open website URL
    When user enters valid username
    And user enters valid password
    And user click login button
    Then user login successfully
  Scenario: user login with invalid username or password
    Given user open browser
    And user open website URL
    When user enters valid username
    And user enters invalid password
    And user click login button
    Then user dont login successfully