Feature: Spike 
  In order to get new customers
  As a salesman
  I want users to be able to simply register with the minimum of details

  Scenario: Sign up with email and password
    Given a user has not signed up
    When user attempts to access a premium feature
    Then they are prompted to register with simply their email and password

  @wip
  Scenario: A second scenario with a work in progress tag
    Given a user has not signed up