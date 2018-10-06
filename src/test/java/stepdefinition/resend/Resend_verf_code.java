package stepdefinition.resend;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



import Base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Resend_verf_code extends Base {
	
public static Logger log=Logger.getLogger(Resend_verf_code.class.getName());
	
	public void before(){
		PropertyConfigurator.configure(path);
		log.info(Resend_verf_code.class.getName()+"is getting executed");
		
		
	}
	
	
	@Given("^the user has not used resend code three or more times in last five mins$")
	public void the_user_has_not_used_resend_code_three_or_more_times_in_last_five_mins() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Resend_verf_code.class.getName()+"is getting executed");
	    
	}

	@Given("^app clearly visible to the user$")
	public void app_clearly_visible_to_the_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Resend_verf_code.class.getName()+"is getting executed");
	    
	}

	@When("^user taps on \"([^\"]*)\" button$")
	public void user_taps_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Resend_verf_code.class.getName()+"is getting executed");
	    
	}

	@Then("^the verification code will be sent via SMS$")
	public void the_verification_code_will_be_sent_via_SMS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Resend_verf_code.class.getName()+"is getting executed");
		
	   
	}

}
