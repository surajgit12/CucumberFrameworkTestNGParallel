@Account
Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|surajgit12@gmail.com|surajgit12|


Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My account - My Shop"

@Regression @Skip_Scenario
Scenario: Accounts section count
Given user is on Accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|Home|
And accounts section count should be 5