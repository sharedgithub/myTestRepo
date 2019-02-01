@tag
Feature: Google Search
  As a user I want to search something So that I can get results

  @tag1
  Scenario Outline: Test Google Search
    Given user is on google home page
    When user search about <searchString>
    Then user should get search results
    Examples:
    |searchString|
    |kamehameha|
