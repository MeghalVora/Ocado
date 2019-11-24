Feature: Search
As end user
I want to search
So that I can see desire product

Scenario: Search for a product
  Given I am on homepage
  When I search for a "Nike"
  Then I should be able see desire product


