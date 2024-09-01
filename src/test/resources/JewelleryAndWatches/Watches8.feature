
@Watches
Feature: WatchesPage feature

   @Eleventh
  Scenario: Validate Watches page  Rectangle checkbox functionality
    Given Open chrome browser8 and select JewelleryAndWatches8 url
    And Select Watches8 url
    When Select  Rectangle checkboxes
    And Compare Rectangle two products on the Watches page
    Then Rectangle comparison results should be displayed
    And Close the browser8 

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
