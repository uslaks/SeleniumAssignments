Feature: Edit Lead flow

Background:
Given Chrome browser is opened
And Load the application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts
And Enter Username as "Demosalesmanager"
And Enter Password as "crmsfa"
And Login button is clicked
And CRMSFA link is clicked
And Leads tab is clicked

Scenario Outline: Edit Lead by changing Company Name
Given Find Leads link is clicked
And Enter FirstName as "Usha" and search Lead
And Select a lead
And Update Company Name as <CompanyName>
When Create Lead button is clicked
Then View Lead page should be displayed
And Close browser

Examples:
|CompanyName|
|'Aspire System'|
|'Kiosk Desk'|
