Feature: Test the login functionality of OrangeHRM

Scenario: Test the valid login
Given user is on loginPage
When user entes username and password
And click on login button
Then user should land on home page 