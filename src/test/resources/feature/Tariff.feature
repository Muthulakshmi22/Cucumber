@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
    Given The Telecom page should be displayed
    When Fill the all the Tariff Plan"<first>","<second>","<third>","<four>","<five>","<six>","<seven>"
    Then Submit the application

    Examples: 
      |first|second|third|four|five|six|seven|
      |100|200|111|111|111|111|111|
      |222|222|222|222|222|222|222|
      |333|333|333|333|333|333|333|
