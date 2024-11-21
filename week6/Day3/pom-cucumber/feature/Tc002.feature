Feature: login functionality for leaftaps



@regression @functional
Scenario Outline: login with positive creditials       
And enter the username as 'demosalesmanager'
And enter the password as 'crmsfa'
When click on login button
When click on crmsfa link
And click on leads link
And click on createlink lead
Given enter the company name as <companyname>
And enter the firstname <firstname>
And enter the last name <lastname>
When click on the create lead button


Examples:
|companyname|firstname|lastname|
|testleaf|saranya|s|
|qeagle|subraja|s|