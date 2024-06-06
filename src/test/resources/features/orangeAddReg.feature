

Feature: Admin option functionality
@TestU
Scenario: Register a new user on Admin option
Given user is on Dashboard 
When user select admin option
And clicks on adding button
And fill out the form
Then user is registered succesfully