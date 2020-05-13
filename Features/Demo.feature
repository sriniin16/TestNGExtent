Feature: Test feature

  Background: This runs in the background for all test scenarios
    When sign in to application
    Then landing page displayed

    Scenario: Scenario 1
      Given this is given
      And this is and
      When this is when
      Then this is then
      And this is a parm in the step "param1"
      And the param is verified

    Scenario: Scenario 2
      Given this is given
      And this is and
      When this is when
      Then this is then
      When I pass may values to the step file
        | username | password  | info|
        | admin    | adminpass | 1   |
        | sys      | syspass   | 2   |
      Then the values are passed


   Scenario Outline: scenario 3
     Given this is given
     And this is and
     When this is when
     Then this is then
     When I pass may values to the step file <username> and <password>
     Examples:
       | username | password  |
       | admin    | adminpass |
       | sys      | syspass   |

