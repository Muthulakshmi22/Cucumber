
Feature: Title of your feature

Background:
Given open the telecom home page
    And click add customer

  @tag1
  Scenario: Title of your scenario
    
    When fill the detail
    |ramya|venkat|abc@gmail.com|coimbatore|9876543211|
    And click submit
    Then c the cm id

  @tag2
 Scenario: Title of your scenario
    When fill the details
    |Fname|ramya|
    |Lname|venkat|
    |email|abc@gmail.com|
    |addr|coimbatore|
    |phone|987654321|
    And click submit button
    Then check the cm id

    @tag3
    Scenario: Title of your scenario
    When fills the detail
    And click the submit button
    Then cm id will b created
