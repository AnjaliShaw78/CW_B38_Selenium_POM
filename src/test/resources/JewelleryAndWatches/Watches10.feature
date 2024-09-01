@Watches
Feature: WatchesPage feature

  @Twelfth
  Scenario: Validate Watches page  Analog checkbox functionality
    Given Open chrome browser10 and select JewelleryAndWatches10 url
    And Select Watches10 url
    When Select  Analog checkboxes
    And Compare Analog two products on the Watches page
    Then Analog comparison results should be displayed
    And Close the browser10  

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
