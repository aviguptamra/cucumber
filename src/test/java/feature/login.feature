Feature: Login feature

Scenario: Login into free CRM

Given User must be landed on CRM login
When User enter valid username "aviguptamra@gmail.com" and password "Cspl1234"
Then User must be landed on login page
And Check user is really login into home page


Scenario Outline: Login into free CRM

Given User must be landed on CRM login
When User enter username <username> and password <password>
Then User must be landed on login page
And Check user is really login into home page

Examples:
|username|password|
|aviguptamra@gmail.com|Cspl1234|