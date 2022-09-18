Feature: Merge Lead flow

Background:
Given Chrome browser is opened
And Load the application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts
And Enter Username as "Demosalesmanager"
And Enter Password as "crmsfa"
And Login button is clicked
And CRMSFA link is clicked
And Leads tab is clicked

Scenario: Create Lead with mandatory inputs
Given Merge Lead is clicked
And From and To Leads are selected using lookup
When Merge button is clicked and message accepted
Then View Lead page should be displayed
And Close browser