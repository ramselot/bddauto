package stepdefinition.auth;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



import Base.Base;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Authorization extends Base {
	
	
public static Logger log=Logger.getLogger(Authorization.class.getName());
	
	@Before
	
	
	public void before(){
		PropertyConfigurator.configure(path);
		log.info(Authorization.class.getName()+"is getting executed");
		
		
	}
	
	
	@Given("^user is on the registration screen on the device$")
	public void user_is_on_the_registration_screen_on_the_device() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Authorization.class.getName()+"is getting executed");
		System.out.println("hello");
	   
	}

	@Given("^app clearly visible to the user and ready with verification code before hand$")
	public void app_clearly_visible_to_the_user_and_ready_with_verification_code_before_hand() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Authorization.class.getName()+"is getting executed");
		System.out.println("hello1");
	   
	}

	@When("^user enters received code full name and email details$")
	public void user_enters_received_code_full_name_and_email_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Authorization.class.getName()+"is getting executed");
		System.out.println("hello2");
	   
	}

	@Then("^registration button is enabled and user journey completes with registration$")
	public void registration_button_is_enabled_and_user_journey_completes_with_registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info(Authorization.class.getName()+"is getting executed");
		System.out.println("hello3");
	   
	}
	

}
