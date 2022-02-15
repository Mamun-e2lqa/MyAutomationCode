package stepFiles;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowserCmdAction {

	 @Given("^navigate to Amazon home page \"([^\"]*)\"$")
	    public void navigate_to_amazon_home_page_something(String url) throws Throwable {
	        
	    }

	    @When("^Maximise the browser$")
	    public void maximise_the_browser() throws Throwable {
	        
	    }

	    @Then("^Go back to browser landing page$")
	    public void go_back_to_browser_landing_page() throws Throwable {
	        
	    }
	    @And("^Forward to Amazon home page$")
	    public void forward_to_amazon_home_page() throws Throwable {
	        
	    }
	    @And("^Refresh the browser$")
	    public void refresh_the_browser() throws Throwable {
	      
	    }

	    @Then("^Perform the double click$")
	    public void perform_the_double_click() throws Throwable {
	      
	    }
	    @And("^Perform the right click$")
	    public void perform_the_right_click() throws Throwable {
	       
	    }

	    @Then("^Perform drag and hold$")
	    public void perform_drag_and_hold() throws Throwable {
	        
	    }

	    @And("^Perform drag and drop$")
	    public void perform_drag_and_drop() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Delete the cookies$")
	    public void delete_the_cookies() throws Throwable {
	        throw new PendingException();
	    }

	
}
