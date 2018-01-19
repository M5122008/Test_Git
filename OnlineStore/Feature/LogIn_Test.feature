Feature: Login Action
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Sign in Page
	When User Navigate to Sign in Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
	| username | password |
    | vermavarshaa@gmail.com | Test@123 |
    | vermavarsha@gmail.com | Test@123 |

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
