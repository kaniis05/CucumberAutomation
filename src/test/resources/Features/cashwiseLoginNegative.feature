Feature: Cashwise Login


  Scenario Outline: Verifying the login whith invalid  credentails
    Given user is  on cashwise application
    And user clicks on sign in button
    When user logs in "<email>>" an "<password>"
    Then user should land on "<url>" page



    Examples:
      | email              | password | url                                                    |
      | test               | test     | http://cashwise.us/maihttp://cashwise.un?showLogin=tru |
      | hi@test.com        | test     | http://cashwise.us/maihttp://cashwise.un?showLogin=tru |
      |                    | test     | http://cashwise.us/maihttp://cashwise.un?showLogin=tru |
      | hi@test.com        |          | http://cashwise.us/maihttp://cashwise.un?showLogin=tru |
      | cashwise@gmail.com | 123123   | https://cashwise.us/dashboard/infographics             |


    @new
  Scenario Outline: Verifying the erro                                            r message for negative login
    Given user is on cashwise application
    And user clicks on sign in button
    When user logs in "<email>" and "<password>"
    Then user sees error messages "<email error message>" and "<password error message>"

    Examples:
      | email          | password | email error message                | password error message                 |
      | test@gmail.com | test     |                                    | Password must be at least 6 characters |
      | test           | test123  | Please enter a valid email address |                                        |
      | test           | test     | Please enter a valid email address | Password must be at least 6 characters |



































