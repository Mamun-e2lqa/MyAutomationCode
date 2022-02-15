Feature: Radio button
As User should be able to select the radio button application under test.

Background:
Given User navigate to landing page "https://courses.letskodeit.com/practice"
When USer validate the title of practice page
@RadioBtn
Scenario: Radio button
Then User verified the radio button eaxmple
And Get the All radio button text 
And User select the "Honda"
And Also user verified the all radio button can be selectable 


Scenario: Drop down
When User verified the Select Class Example
Then User verified the dropdown list
|BMW|
|Benz|
|Honda|
And User select the "Benz" from the dropdown list


Scenario: Multiple Select Example
When User validate the single select "Apple"
Then User validate the multiple select options


Scenario: Checkbox Example
When User validate the single checkbox "Benz"
Then User validate the multiple checkbox 

Scenario: Switch Window Example
When User click the open windows
Then New windows is Opend get the new windows "title"
And User close the child window
Then User Go back to the parent window
When User validate the "title" of parent windows


Scenario: Switch Tab Example
When User click the open tab
Then New tab is Opend validate the new tab "heder" text
|All Courses|
And User click on the JS course
Then User get the Course Curriculum
And User close the child tab
Then User Go back to the parent tab
When User validate the "title" of parent tab

Scenario: Switch To Alert Example
When User send the text to the textbox
Then User click on the alert button
And User handle the alert
Then User click on the confirm button
Then User get the text from popup
And User handle the confirm alert

Scenario: Web Table Example
When User validate the webtable heder
Then User get all of the table data
Then User validate the Author name courses and Price

Scenario: Enabled/Disabled Example
When User click on disable button
Then Validate the text box apper disable
And User Click on the eneble button
Then User able to enter the text on textbox

Scenario: Element Displayed Example
When User click on Hide button
Then Validate the textbox is Hide
And Get the text from hidebox
Then User Click on the show button
And User able to enter the text on textbox

Scenario: Mouse Hover Example
When User mouse hover on the mousehover button
Then User get the data from dropdown
And User click on the Top

Scenario: iFrame Example
When User click on the SignIn link
Then User enter "email" address and "Password"
And User click on the login button
Then Validate the error text


