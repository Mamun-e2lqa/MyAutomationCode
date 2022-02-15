Feature: Exceptions
@Exceptions
Scenario: Handling Exception on selenium
Given Navigate to browser landing page "Url" 

When StaleElementException
Then Handle this StaleElementException
When NoSuchElementException 
Then Handle this NoSuchElementException
When ElementNotVisibleException
Then Handle this ElementNotVisibleException
When NoAlertPresentException
Then Handle this NoAlertPresentException
When NoSuchFrameException 
Then Handle this NoSuchFrameException
When NoSuchWindowException
Then Handle this NoSuchWindowException 
When TimeoutException 
Then Handle this TimeoutException
When InvalidElementStateException
Then Handle this InvalidElementStateException 
When NoSuchAttributeException
Then Handle this NoSuchAttributeException 
When WebDriverException 
Then Handle this WebDriverException
And Close the browser

