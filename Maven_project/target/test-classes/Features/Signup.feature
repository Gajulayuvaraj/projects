Feature: Signup to the Zomato website

Scenario: User able to Signup with valid credentials
Given user give the valid credrencials
And user click the sign up button
When user gives the fullname as "<fullname>" and emailid as "<emailid>"
And click on the check button
And click to the signup button
When user enter the otp as "<otp>"
And click on the otp button
Then user navigate to the login page
