
@Watches
Feature: WatchesPage feature

   @Fourteenth
 Scenario: Validate Watches page  Square checkbox functionality
    Given Open chrome browser9 and select JewelleryAndWatches9 url
    And Select Watches9 url
    When Select  Square checkboxes
    And Compare Square two products on the Watches page
    Then Square comparison results should be displayed
    And Close the browser9 

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
