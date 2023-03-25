Feature: Google search

  Scenario:  Verifying the results for google search
    Given I am on the google page
    When  I search for "Toyota"
    Then I should see  only "Toyota" related results

 Scenario:  Verifying image result
   Given  I am on the google page
   When I search for "James Bond"
   And I click on image option
   Then  I should see onle "James Bond" related images



  Scenario Outline: Google search verification
    Given I am on the google page
    When I search for "<word>"
    Then I should see only "<word>" related results

    Examples:
      | word             |
      | cucumber         |
      | lexus            |
      | codewise academy |
      | Trump            |
      | Coach bag        |