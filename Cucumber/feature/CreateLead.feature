Feature: Create Lead flow

Background:
Given Chrome browser is opened
And Load the application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts
And Enter Username as "Demosalesmanager"
And Enter Password as "crmsfa"
And Login button is clicked
And CRMSFA link is clicked
And Leads tab is clicked

Scenario Outline: Create Lead with mandatory inputs
Given Create Lead link is clicked
And Enter Mandatory Lead information as <CompanyName>, <FirstName>, <LastName>
When Create Lead button is clicked
Then View Lead page should be displayed
And Close browser

Examples:
|CompanyName|FirstName|LastName|
|'Reshu Ent'|'Naga'|'Raja'|
|'Kanishka Ent'|'Usha'|'Naga'|

Scenario: Create Lead with missing mandatory input
Given Create Lead link is clicked
And Enter only Company Name as "Kanthavilas"
When Create Lead button is clicked
Then Error Message should be displayed
And Close browser