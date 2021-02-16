Feature: To validate the login functionality
Scenario: To verify the facebook login functionality with valid username and invalid password 
Given User has to launch the chrome browser and hit the fb url
When User enter the username and password
And click the login button
Then User should be invalid credential page
