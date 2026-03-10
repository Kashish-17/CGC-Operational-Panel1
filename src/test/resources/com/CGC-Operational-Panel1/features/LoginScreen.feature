
@feature_user_login
Feature: LoginScreen

  Background: 
    Given the user is on the Login Page

  @valid_login
  Scenario Outline: Verify that a user can successfully log in using valid Organization, Email, and Password
    When I enter "<organization>" in the Organization field
    And I enter "<email>" in the Email field
    And I enter "<password>" in the Password field
    And the user clicks the Login button
    Then the user should be redirected to the home screen
    And a welcome message should be displayed on the home screen

    Examples:
      | organization      | email              | password           |
      | MyOrganization    | user@example.com   | SecurePassword123   |

@enabled_login_button
Scenario Outline: Verify that the Login button is enabled when all required fields are filled with valid data
  When I enter "<organization>" in the Organization field
  And I enter "<email>" in the Email field
  And I enter "<password>" in the Password field
  Then the Login button should be enabled

Examples:
  | organization     | email              | password            |
  | MyOrganization    | user@example.com   | SecurePassword123   |

  @forgot-password-navigation
  Scenario Outline: Verify navigation to the Forgot Password screen
    When the user locates and clicks the Forgot Password link
    Then the user is redirected to the Forgot Password screen
    And the Forgot Password screen displays Organization and Email fields

  Examples:
    | action                          |
    | Launch the application URL      |
    | Locate and click the Forgot Password link |

@valid-password-reset
Scenario Outline: Verify that the user can successfully send a password reset email
  Given the user enters a valid Organization name in the Organization field
  And the user enters a valid Email address in the Email field
  When the user clicks the Send button
  Then the system sends a password reset email
  And the user receives the email in their inbox

  Examples:
    | Organization         | Email                   |
    | ValidOrganizationName| valid.email@example.com  |

  @valid-inputs
  Scenario Outline: Verify that the Login button state changes to enabled when valid inputs are provided in all fields
    When I enter "<organization>" in the Organization field
    And I enter "<email>" in the Email field
    And I enter "<password>" in the Password field
    Then the Login button should be enabled

    Examples:
      | organization         | email              | password            |
      | example_organization | user@example.com   | SecurePassword123    |

  @invalid-email-format
  Scenario Outline: Verify that the Login button remains disabled when an invalid email format is entered
    When I enter "<organization_name>" in the Organization field
    And I enter "<email>" in the Email field
    And I enter "<password>" in the Password field
    Then the Login button should be disabled

    Examples:
      | organization_name   | email          | password  |
      | Organization Name   | invalidemail   | Password  |

  @invalid-organization
  Scenario Outline: Verify Login button state with invalid Organization
    When I enter "<organization>" in the Organization field
    And I enter "<email>" in the Email field
    And I enter "<password>" in the Password field
    Then the Login button should be disabled

    Examples:
      | organization            | email                   | password          |
      | invalid_organization_name | valid.email@example.com | ValidPassword123  |
