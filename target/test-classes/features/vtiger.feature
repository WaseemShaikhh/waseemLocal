Feature: Testing vtiger application

 Scenario: Testing vtiger login functionality for valid user
 Given User is already having application URL
 And also having username and password
 When user enter the username and password
 And clicks on login button
 Then vtiger home page will be displayed
 And close the browser
