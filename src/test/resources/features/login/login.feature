#Author: anantharam@selotsoft.com
#Sample Feature Definition Template
@first_time_registration_process
Feature: first time app user registration process,registration requires verification code to be entered which is received to the user via sms,along side
         verification code,registration process requires full name ,email to be entered ,by registering user agrees to EULA
  I want to use this template for my feature file

  @Auth_scenario
  Scenario: app authentication process
    Given user is on the registration screen on the device
    And app clearly visible to the user and ready with verification code before hand
    When user enters received code full name and email details
    Then registration button is enabled and user journey completes with registration
