@us_03 @smoke @regression
Feature: As a user, I should be access all the main modules of the app.

  Background:
    Given user on the login page
  @wip
  Scenario: As a user, I should be access all the main modules of the app.
    When user  log in with valid credentials
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |