
@Watches
Feature: WatchesPage feature

   @Sixth
  Scenario: Validate Watches page Sukkhi checkbox functionality
    Given Open chrome browser3 and select JewelleryAndWatches3 url
    And Select Watches3 url
    When Select Sukkhi checkbox
    And Compare Sukkhi two products on the Watches page
    Then Sukkhi comparison results should be displayed
    And Close the browser3 

 # @tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
