Feature: Dresses Type feature

Background:
Given user has already logged in to application
|username|password|
|surajgit12@gmail.com|surajgit12|

Scenario: Multiple dresses types
Given  Dresses option is available
When User  just move the mouseohver on the dressesOption link
Then  Mulitple dresses options should be available
And   click on on casual dresses option link
Then  page title should be"Casual Dresses - My Shop"