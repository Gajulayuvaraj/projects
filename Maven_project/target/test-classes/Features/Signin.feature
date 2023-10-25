Feature: signin into the amazon application

Background:
Given user navigate the webpage

Scenario: user able to signin to the valid credrentials
Given user click on the signin button
When user enter the mobile number "<number>"
And user click on the continue button
When user enter the password as "<password>"
And user click on the button
And finally user navigate the Home page of the webpage

Scenario:user able to signin with invalid credrentials
Given user click on the signin button
When user enter the invalid mobile number "<number>"
And user click on the continue button
When user enter the invalid password as "<password>"
And user click on the button
And finally user navigate the Home page of the webpage

Scenario:user able to signin with valid mobile number and invalid password
Given user click on the signin button
When user enter the mobile number "<number>"
And user click on the continue button
When user enter the invalid password as "<password>"
And user click on the button
And finally user navigate the Home page of the webpage

Scenario:user able to signin with invalid mobile number and valid password
Given user click on the signin button
When user enter the invalid mobile number "<number>"
And user click on the continue button
When user enter the password as "<password>"
And user click on the button
And finally user navigate the Home page of the webpage

Scenario:user able to signin without entering any text
Given user click on the signin button
When user without enter the mobile number "<number>"
And user click on the continue button
When user without enter the password as "<password>"
And user click on the button
And finally user navigate the Home page of the webpage

Scenario: user get the screenshot of the webpage
Given user click on the signin button
When user enter the mobile number "<number>"
And user copy the mobile number page screenshot
And user click on the continue button
When user enter the password as "<password>"
And user take the password page screenshot
And user click on the button
And finally user navigate the Home page of the webpage

Scenario: user get the screenshot of the webpage
Given user take the entire page srceenshot
And finnaly user get the entire screenshot of the webpage

Scenario: user navigate the terms and conditions
Given user click on the signin button
When user click on the terms and condition link
And user navigate to the terms and conditions page
And click on the helpful information button

Scenario: user navigate to the privacy notice
Given user click on the signin button
When user click on the privacy notice
And user navigate to the privacy notice page
And click on the helpful information button
And user backward to the signin page

@login
Scenario: user navigate the terms and conditions
Given user click on the signin button
When user click on the terms and condition link
And user navigate to the terms and conditions page
And click on the helpful information button No
And Please select what best describes the information
And user click on the radiobutton 
And click on the summit button
And finnaly display the thank you giving the feeback to use the information






