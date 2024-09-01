@Watches
Feature: WatchesPage feature
  

  @First1
  Scenario: Validate WatchesPage Cash on Delivery functionality
    Given Open chrome browser and select JewelleryAndWatches url
    And Select Watches url
    When Click Cash on Delivery checkbox
    And Enter pincode
    Then Click set button
    And Close the browser
  

  @Second
  Scenario: Validate Watches page clear all functionality
    Given Open chrome browser and select JewelleryAndWatches url
    And Select Watches url
    When Select all checkboxes 
    And User enters pincode
    Then Select clear all link
    And Close the browser

  @Third
  Scenario: Validate Watches page compare functionality
    Given Open chrome browser and select JewelleryAndWatches url
    And Select Watches url
    When Compare two products on the Watches page
    Then Comparison results should be displayed
    And Close the browser 
@Fourth
  Scenario: Validate Abrexo checkbox functionality
    Given Open chrome browser and select JewelleryAndWatches url
    And Select Watches url
    When Select Abrexo checkbox
    And Compare Abrexo two products on the Watches page
    Then Comparison Abrexo results should be displayed
    And Close the browser 
  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
