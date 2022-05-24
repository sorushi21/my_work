Feature: Login page testcase

Scenario: Login page field validation
Given user is on login page
When user enters username as "<username>" 
And user enters password
And user click login button
Then homepage is diplayed

#Examples: 
#| username |
#| java |
#| c |
#| c++ |