Feature: login function
  Scenario Outline: user login with multiple username and password
    Given user will open browser
    And user will open website URL
    When user enters valid <username> and <password> fields
    And clicks login button
    Then user will login successfully

    Examples:
      | username               | password      |
      | standard_user          | secret_sauce  |
      | locked_out_user        | secret_sauce  |
      | problem_user           | secret_sauce  |
      | performance_glitch_user| secret_sauce  |