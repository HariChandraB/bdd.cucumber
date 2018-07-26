#Sample Feature Definition Template
Feature: Verify Amazon Product search Functionality by relevance

Scenario: user goes to search box and enters the product
Given user is on amazon page
When user enters productName in search textBox
And user clicks on textBox
And user checks all products 
Then user sort items by relevance
And user validates the error message
