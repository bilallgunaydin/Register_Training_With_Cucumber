Feature: Register Test

  Background:
    Given Navigate to Website
    And type username "Admin"
    And type password "Admin123"
    And click on Pharmacy Button
    And click on Log In Button
    And click on Register a patient Button
  Scenario Outline: Person
    And type Given "<given>"
    And type Family Name "<familyName>"
    And click next button
    And select gender "<gender>"
    And click next button
    And type Day <day>
    And select Month "<month>"
    And type Year <year>
    And click next button
    And type address "<address>"
    And click next button
    And type phone number <phoneNumber>
    And click next button
    And selected relationship "<relationship>"
    And type personName "<personName>"
    And click next button
    When click Confirm button
    Then verify success name
    Examples:
      | given | familyName | gender | day | month  | year | address | phoneNumber | relationship | personName |
      | Bilal | Günaydın   | Male   | 1   | August | 1992 | Bursa    | 5064899     | Doctor       | Muhittin   |
      |Ahmet  |Şükrü       |Female  |2    |August  |1990  |İstanbul  |50644        |Doctor        |Fatma       |

