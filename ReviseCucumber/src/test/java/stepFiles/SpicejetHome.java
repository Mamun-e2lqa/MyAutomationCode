package stepFiles;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpicejetHome {
	
	
	
	@Given("^User navigate to the home page using \"([^\"]*)\"$")
	public void user_navigate_to_the_home_page_using(String URL) throws Throwable {
	    
	}

	@When("^User validate the \"([^\"]*)\" of spiceJet$")
	public void user_validate_the_title_of_spiceJet(String title) throws Throwable {
	    
	}
	 @And("^Welcome abroad text$")
	    public void welcome_abroad_text() throws Throwable {
	        
	    }


	@Then("^Verify the oneway radio button is selected if not select the button$")
	public void verify_the_oneway_radio_button_is_selected_if_not_select_the_button() throws Throwable {
	   
	}
    

	 @Then("^Select the departure city$")
	    public void select_the_departure_city() throws Throwable {
	        
	    }
    
    @And("^Select the Destination city$")
    public void select_the_destination_city() throws Throwable {
       
    }
    
    @And("^Select the departure date$")
    public void select_the_departure_date() throws Throwable {
        
    }

    @Then("^Validate The return date should not be visiable for one way$")
    public void validate_the_return_date_should_not_be_visiable_for_one_way() throws Throwable {
       
    }

    

    
    @And("^Select the Noof passenger$")
    public void select_the_noof_passenger() throws Throwable {
       
    }

    @And("^Select the currency$")
    public void select_the_currency() throws Throwable {
       
    }

    @Then("^select the All checkboxs if is not selected if its selected  deselect and select again$")
    public void select_the_All_checkboxs_if_is_not_selected_if_its_selected_deselect_and_select_again(DataTable data) throws Throwable {
        
    }
    @Then("^Verify the departure and arrival city$")
    public void verify_the_departure_and_arrival_city() throws Throwable {
      
    }

    @And("^Click the search flight button$")
    public void click_the_search_flight_button() throws Throwable {
        
    }
    
    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
        
    }



}
