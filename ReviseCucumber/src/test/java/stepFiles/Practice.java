package stepFiles;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.PracticePageAction;
import uttils.Base;

public class Practice {
	
	PracticePageAction action = new PracticePageAction();

	@Given("^User navigate to landing page \"([^\"]*)\"$")
    public void user_navigate_to_landing_page_url(String WebSiteUrl) throws Throwable {
		Base.openPage(WebSiteUrl);
        
    }

    @When("^USer validate the title of practice page$")
    public void user_validate_the_title_of_practice_page() throws Throwable {
        Base.getTitle();
    }
    @Then("^User verified the radio button eaxmple$")
    public void user_verified_the_radio_button_eaxmple() throws Throwable {
    	action.getText();
    }
    
    @And("^Get the All radio button text$")
    public void get_the_all_radio_button_text() throws Throwable {
        
    }

    @And("^User select the \"([^\"]*)\"$")
    public void user_select_the_something(String strArg1) throws Throwable {
        
    }

    @And("^Also user verified the all radio button can be selectable$")
    public void also_user_verified_the_all_radio_button_can_be_selectable() throws Throwable {
        
    }	
    
    @When("^User verified the Select Class Example$")
    public void user_verified_the_select_class_example() throws Throwable {
     
    }

    @Then("^User verified the dropdown list$")
    public void user_verified_the_dropdown_list() throws Throwable {
        
    }

    @And("^User select the \"([^\"]*)\" from the dropdown list$")
    public void user_select_the_something_from_the_dropdown_list(String strArg1) throws Throwable {
      
    }
    
    @When("^User validate the single select \"([^\"]*)\"$")
    public void user_validate_the_single_select_something(String strArg1) throws Throwable {
       
    }
    @Then("^User validate the multiple select options$")
    public void user_validate_the_multiple_select_options() throws Throwable {
        
    }

    @When("^User validate the single checkbox \"([^\"]*)\"$")
    public void user_validate_the_single_checkbox_something(String strArg1) throws Throwable {

    }
    
    @Then("^User validate the multiple checkbox$")
    public void user_validate_the_multiple_checkbox() throws Throwable {
  
    }
    @When("^User click the open windows$")
    public void user_click_the_open_windows() throws Throwable {
        
    }
    @Then("^New windows is Opend get the new windows \"([^\"]*)\"$")
    public void new_windows_is_opend_get_the_new_windows_something(String title) throws Throwable {
        
    }
    @And("^User close the child window$")
    public void user_close_the_child_window() throws Throwable {
        
    }
    
    @Then("^User Go back to the parent window$")
    public void user_go_back_to_the_parent_window() throws Throwable {
        
    }


    @When("^User validate the \"([^\"]*)\" of parent windows$")
    public void user_validate_the_something_of_parent_windows(String title) throws Throwable {
        
    }
    
    @When("^User click the open tab$")
    public void user_click_the_open_tab() throws Throwable {
        
    }
    @Then("^New tab is Opend validate the new tab \"([^\"]*)\" text$")
    public void new_tab_is_opend_validate_the_new_tab_something_text(String heder) throws Throwable {
        
    }
    @And("^User click on the JS course$")
    public void user_click_on_the_js_course() throws Throwable {
        
    }
    @Then("^User get the Course Curriculum$")
    public void user_get_the_course_curriculum() throws Throwable {
        
    }
    @And("^User close the child tab$")
    public void user_close_the_child_tab() throws Throwable {
        
    }
    @Then("^User Go back to the parent tab$")
    public void user_go_back_to_the_parent_tab() throws Throwable {
       
    }


    @When("^User validate the \"([^\"]*)\" of parent tab$")
    public void user_validate_the_something_of_parent_tab(String strArg1) throws Throwable {
        
    }
    
    @When("^User send the text to the textbox$")
    public void user_send_the_text_to_the_textbox() throws Throwable {
        
    }

    @Then("^User click on the alert button$")
    public void user_click_on_the_alert_button() throws Throwable {
        
    }
    @And("^User handle the alert$")
    public void user_handle_the_alert() throws Throwable {
        
    }

    @Then("^User click on the confirm button$")
    public void user_click_on_the_confirm_button() throws Throwable {
        
    }

    @Then("^User get the text from popup$")
    public void user_get_the_text_from_popup() throws Throwable {
        
    }

    

    @And("^User handle the confirm alert$")
    public void user_handle_the_confirm_alert() throws Throwable {
        
    }
    
    @When("^User validate the webtable heder$")
    public void user_validate_the_webtable_heder() throws Throwable {
        
    }

    

    @Then("^User get all of the table data$")
    public void user_get_all_of_the_table_data() throws Throwable {
        
    }

    @Then("^User validate the Author name courses and Price$")
    public void user_validate_the_author_name_courses_and_price() throws Throwable {
       
    }
    @When("^User click on disable button$")
    public void user_click_on_disable_button() throws Throwable {
       
    }

    @Then("^Validate the text box apper disable$")
    public void validate_the_text_box_apper_disable() throws Throwable {
       
    }

    

    @And("^User Click on the eneble button$")
    public void user_click_on_the_eneble_button() throws Throwable {
        
    }
    @Then("^User able to enter the text on textbox$")
    public void user_able_to_enter_the_text_on_textbox() throws Throwable {
        
    }
    @When("^User click on Hide button$")
    public void user_click_on_hide_button() throws Throwable {
        
    }

    @Then("^Validate the textbox is Hide$")
    public void validate_the_textbox_is_hide() throws Throwable {
        
    }

    

    @And("^Get the text from hidebox$")
    public void get_the_text_from_hidebox() throws Throwable {

    }
    @Then("^User Click on the show button$")
    public void user_click_on_the_show_button() throws Throwable {
        
    }
    
    @When("^User mouse hover on the mousehover button$")
    public void user_mouse_hover_on_the_mousehover_button() throws Throwable {
        
    }

    @Then("^User get the data from dropdown$")
    public void user_get_the_data_from_dropdown() throws Throwable {
        
    }

    @And("^User click on the Top$")
    public void user_click_on_the_top() throws Throwable {
        
    }
    @When("^User click on the SignIn link$")
    public void user_click_on_the_signin_link() throws Throwable {
       
    }

    @Then("^User enter \"([^\"]*)\" address and \"([^\"]*)\"$")
    public void user_enter_something_address_and_something(String strArg1, String strArg2) throws Throwable {
    
    }
    @And("^User click on the login button$")
    public void user_click_on_the_login_button() throws Throwable {
        
    }

    @Then("^Validate the error text$")
    public void validate_the_error_text() throws Throwable {
        
    }

    


    

    
    

    

    


    

   
    

	
	
}
