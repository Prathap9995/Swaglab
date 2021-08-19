
Feature: SwagLab Loginpage
  I want to use this template for my feature file

  
  Scenario: Get Title
    Given Navigate to swag lab page <https://www.saucedemo.com/>
    When check title is displayed
    Then Take screenshot
    And close browser

  