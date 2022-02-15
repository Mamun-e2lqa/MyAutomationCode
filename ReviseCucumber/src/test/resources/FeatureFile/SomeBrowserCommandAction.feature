Feature: command

Scenario: Some browser command and key action
Given navigate to Amazon home page "url"
|https://www.amazon.com/|
When Maximise the browser
Then Go back to browser landing page
And Forward to Amazon home page 
And Refresh the browser
Then Perform the double click
And Perform the right click
Then Perform drag and hold 
And Perform drag and drop
And Delete the cookies

