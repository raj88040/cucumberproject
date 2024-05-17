@Search
Feature: Ebay Search

  @Positive
  Scenario: To Test eBay Search filter.
    Given User Open chrome browser and enter eBay website
    When User selects Arts from the filter dropdown
    And User clicks on Search
    Then All the items related to Arts should be displayed.