Feature: Application Logins

  Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User Login into Application with "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"



  Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User Login into Application with "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"