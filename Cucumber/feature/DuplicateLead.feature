Feature: Duplicate Lead flow

Background:
Given Chrome browser is opened
And Load the application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts
And Enter Username as "Demosalesmanager"
And Enter Password as "crmsfa"
And Login button is clicked
And CRMSFA link is clicked
And Leads tab is clicked

Scenario: Duplicate Lead
Given Find Leads link is clicked
And Enter FirstName as "Usha" and search Lead
And Select a lead
When Duplicate Lead button is clicked and Submitted
And Close browser