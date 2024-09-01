
@Watches
Feature: WatchesPage feature

  @Thirteenth
  Scenario: Validate Watches page  Digital checkbox functionality
    Given Open chrome browser11 and select JewelleryAndWatches11 url
    And Select Watches11 url
    When Select  Digital checkboxes
    And Compare Digital two products on the Watches page
    Then Digital comparison results should be displayed
    And Close the browser11 

 # @tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
