Feature: menu PET
  @LoginEdenV3
  Scenario: "Login at EdenFarm"
    Given User already on EdenFarm login page
    When I input email "superadmin@edenfarm.id" and password "abcde123" in Eden
    And User click on Button Continue
    Then Directedted to Home Page


