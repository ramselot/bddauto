#Author: anantharam@selotsoft.com
#Sample Feature Definition Template
@verification_resend_process 
Feature: the user has not used resend code 3 or more times 

	I want to use this template for my feature file

@Auth_scenario 
Scenario: the user has not used resend code three or more times 
	Given the user has not used resend code three or more times in last five mins 
	And app clearly visible to the user 
	When user taps on "Login" button 
	Then the verification code will be sent via SMS 
