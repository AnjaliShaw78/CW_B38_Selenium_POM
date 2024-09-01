@Watches
Feature: WatchesPage feature

   @Tenth
  Scenario: Validate Watches page  Round checkbox functionality
    Given Open chrome browser7 and select JewelleryAndWatches7 url
    And Select Watches7 url
    When Select  Round checkboxes
    And Compare Round two products on the Watches page
    Then Round comparison results should be displayed
    And Close the browser7 

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
