
@Watches
Feature: WatchesPage feature

  @Fifth
  Scenario: Validate Watches page Branded checkbox functionality
    Given Open chrome browser and select JewelleryAndWatches2 url
    And Select Watches2 url
    When Select Branded checkbox
    And Compare Branded two products on the Watches page
    Then Branded Comparison results should be displayed
    And Close2 the browser 
 # @tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

   #Examples: 
    #  | name  | value | status  |
    #  | name1 |     5 | success |
     # | name2 |     7 | Fail    |
