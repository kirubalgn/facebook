package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBookLogin extends Base{
	
	PageObjectManager pageObjectManager;
	LoginPojo loginPojo;
	
	@Given("User has to launch the chrome browser and hit the fb url")
	public void user_has_to_launch_the_chrome_browser_and_hit_the_fb_url() {
		loadBrowser();
		launchUrl("https://www.facebook.com/");
	    
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
		
		pageObjectManager=PageObjectManager.getPageObjectManager();
		loginPojo=pageObjectManager.getLoginPojo();
		loginPojo.loginUsernameAndPassword("kiruba", "kiruba@123");
	}

	@When("click the login button")
	public void click_the_login_button() throws InterruptedException {
	    loginPojo.loginButton();
	    Thread.sleep(3000);
	}

	@Then("User should be invalid credential page")
	public void user_should_be_invalid_credential_page() {
		
		System.out.println("Invalid User");
	    
	}


}
