Feature: SpiceJet Serach Flight
  User should be able to book the flight.
@OneWayFlight
  Scenario: Verify the search flight for one way
    Given User navigate to the home page using "url"
    |https://www.spicejet.com|
    When User validate the "title" of spiceJet
    |SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets|
    And Welcome abroad text
    Then Verify the oneway radio button is selected if not select the button
    Then Select the departure city
    And Select the Destination city
    And Select the departure date
    Then Validate The return date should not be visiable for one way
    And Select the Noof passenger
    And Select the currency
    And select the All checkboxs if is not selected if its selected  deselect and select again
      | Family & Friends | Senior Citizen | Unaccompanied Minor | Students | Armed Forces | LTC | Govt. Employee | Health Professional |
    And Click the search flight button
    Then Verify the departure and arrival city
    And close the browser
    
  
