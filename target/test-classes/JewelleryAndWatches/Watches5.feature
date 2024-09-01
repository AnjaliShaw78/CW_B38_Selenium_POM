
@Watches
Feature: WatchesPage feature

   @Eighth
    Scenario: Validate Watches page  House of Vellani checkbox functionality
    Given Open chrome browser5 and select JewelleryAndWatches5 url
    And Select Watches5 url
    When Select  House of Vellani checkbox
    And Compare House of Vellani two products on the Watches page
    Then House of Vellani comparison results should be displayed
    And Close the browser5 
  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
