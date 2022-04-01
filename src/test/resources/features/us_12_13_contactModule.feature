Feature: As a user, I should be able to access to Contacts module.

  Background:
    Given user on the dashboard page

  @us-12
  Scenario: As a user, I should be able to access to Talks module
    When user clicks "Talk" module
    Then verify the page title is "Contacts - Trycloud QA"
  @us-13
  Scenario: As a user, I should be able to access to Contacts module
    When user clicks "Contacts" module
    Then verify the contact names are listed
      | Gurhan |
      | Mike   |
      | Muhtar |
      | Test   |