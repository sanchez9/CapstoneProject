Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  #This is comment in feature file
  @smokeTest @Regression @FunctionalTestCases
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'sstest@gmail.com' and password 'Sstest@123'
    And User click on login button
    Then User should be logged in into Account
    And User clicks on LogoutButton

  @tc001
  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and passwork '<password>'
    And User clicks on login button
    Then User should be logged in into Account

    Examples: 
      | email | password |

  @dryRun @smokeTest @Regression @registerAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the singUp information with below data
      | name      | email               | password     | confirmPassword |
      | Stephanie | testest02@gmail.com | Testtest@123 | Testtest@123    |
    And User click on signUp button
    Then User should be logged into account page
