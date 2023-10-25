Feature: Search functionality

Scenario: search for a valid product
Given I got navigated to home page
When I enter the valid product like product as "<product>"
And I click on search button
Then valid product should got displayed in search results