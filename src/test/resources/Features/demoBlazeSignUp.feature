Feature: Demo Blaze Sign up
  @data
  Scenario Outline: Verifying existing account for sing up
    Given user is on demo blaze application
    And user clicks on sing up button
    When user enters credentialsb"test" and "test" and clicks sign up
    Then user should see alert message "<message>"



    Examples:

    | username | password | message |
    |test      |          |Please fill out Username and password|
    |          |          |                                     |
    |test      |          |Please fill out Username and password|
    |          |          |Please fill out Username and password|
    |          |          |Please fill out Username and password|
    |          |          |This user already exist.             |
    |placeholder|         |String up succerssfull               |



















