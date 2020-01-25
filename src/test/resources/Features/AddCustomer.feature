@regression 
Feature: Add Customer feature

Background:

    And User click on add customer button

@sanity
  Scenario: validate add customer module
    When User enters all the fields
    And User click on submit button
    Then User should be displayed customer id

@ab @bc 
  Scenario: validate add customer module with oneDim list
    When User enters all the field with oneDim
      | karthi | rajan | kr@gmail.com | tanjore | 34562123341 |
    And User click on submit button
    Then User should be displayed customer id

@bc
  Scenario: validate add customer module with oneDim list
    When User enters all the field with oneDimMap
      | fname | karthi          |
      | lname | rajan           |
      | mail  | rajan@gmail.com |
      | addr  | peravurani      |
      | phno  |     12347893533 |
    And User click on submit button
    Then User should be displayed customer id

@sanity
  Scenario: validate add customer module with twoDim list
    When User enters all the field with twoDim
      | karthi   | rajan    | kr@gmail.com | tanjore  | 34562123341 |
      | java     | object   | jr@gmail.com | chennai  | 34562123341 |
      | selenium | syntax   | sr@gmail.com | banglore | 34562123341 |
      | cucumber | features | cr@gmail.com | kerala   | 34562123341 |
    And User click on submit button
    Then User should be displayed customer id

  Scenario: validate add customer module with twoDim list
    When User enters all the field with twoDimMap
      | fname    | lname    | email        | address  | phno        |
      | karthi   | rajan    | kr@gmail.com | tanjore  | 34562123341 |
      | java     | object   | jr@gmail.com | chennai  | 34562123341 |
      | selenium | syntax   | sr@gmail.com | banglore | 34562123341 |
      | cucumber | features | cr@gmail.com | kerala   | 34562123341 |
    And User click on submit button
    Then User should be displayed customer id
