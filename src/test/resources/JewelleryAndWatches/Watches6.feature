
@Watches
Feature: WatchesPage feature

  @Ninth
  Scenario: Validate Watches page Women checkbox functionality
    Given Open chrome browser6 and select JewelleryAndWatches6 url
    And Select Watches6 url
    When Select Women checkboxes
    And Compare Women two products on the Watches page
    Then Women comparison results should be displayed
    And Close the browser6 

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
