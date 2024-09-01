
@Watches
Feature: WatchesPage feature

    @Seventh
 Scenario: Validate Watches page Men checkbox functionality
    Given Open chrome browser4 and select JewelleryAndWatches4 url
    And Select Watches4 url
    When Select Men checkbox
    And Compare Men two products on the Watches page
    Then Men comparison results should be displayed
    And Close the browser4  

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

   # Examples: 
   #   | name  | value | status  |
    #  | name1 |     5 | success |
     # | name2 |     7 | Fail    |
