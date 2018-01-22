Feature: LoginFeature
  deals with login functionality

  Scenario: Login with correct username and password
    Given navigate to login page
    When enter user email address as Email:admin
    And verify the count of my salary digits for Rs 1000
    And enter following for login
      |username | password |
      | admin | adminpassword |
      | admin2 | adminpass2 |
    And click login button
    Then should see userform page

  Scenario: Login with correct username and password to fail
    Given navigate to login page
    When enter following for login
      |username | password |
      | admin | adminpassword |
      | admin2 | adminpass2 |
    And click login button
    Then should see userform page wrongly

  Scenario: Login with incorrect username and password
    Given opened the "http://www.allegro.pl" site
    When click on Moje Allegro - Zaloguj sie
    And enter following for login
      |username | password |
      | admin | adminpassword |
    And click login button
    Then should see userform error page


