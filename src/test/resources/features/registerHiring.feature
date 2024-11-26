Feature: I as user of OrangeHRM
  I want to register a new hire
  on the platform.

  Scenario: Successful recruitment registered on the OrangeHRM platform
    Given dashboard page
    When the user registers a new hire on the platform by filling out all the fields
    Then the information in the new registration matches the information completed and the registration status is "hired"
