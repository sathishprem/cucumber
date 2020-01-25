@ab 
Feature: Add Tariff Plan

 Background:
     And User click on add tariff plan button
 

@sanity
    Scenario: validate add tariff plan

    When user enter all the fields
    And user click on submitbutton
    Then User should be displayed success plan
  Scenario: validate add tariff plan


  # And User click on add tariff plan button
  #  When user enter all the fields with oneD
  #    | 50000 | 50 | 5 | 4000 | 400 | 40 | 4 |
  #  And user click on submitbutton
  #  Then User should be displayed success plan
  Scenario: validate add tariff plan


  #  And User click on add tariff plan button
  # When user enter all the fields with oneDM
  #   | rental1         | 70000 |
  #    | local_minutes   |    70 |
  #   | inter_minutes   |     7 |
  #   | sms_pack        |  8000 |
  #   | minutes_charges |   800 |
  #   | inter_charges   |    80 |
  #   | sms_charges     |     8 |
  #  And user click on submitbutton
  #  Then User should be displayed success plan
 
 @sanity
  Scenario: validate add tariff plan

    And User click on add tariff plan button
    When user enter all the fields with twoDL
      | 50000 | 50 | 5 | 4000 | 400 | 40 | 4 |
      | 60000 | 60 | 6 |  400 | 300 | 90 | 6 |
      | 70000 | 70 | 7 |  450 | 200 | 30 | 2 |
    And user click on submitbutton
    Then User should be displayed success plan

  Scenario Outline: 
   # Examples: 
    #  | rental | locMin | InterMin | sms  | minutes | interChrgs | smsChrgs |
     # |  50000 |     50 |        5 | 4000 |     400 |         40 |        4 |
      #|   6000 |     60 |        5 | 3000 |     200 |         20 |        2 |
     # |   7000 |     70 |        5 | 2000 |     300 |         30 |        1 |
      #|   8000 |     80 |        5 | 1000 |     100 |         40 |        3 |
