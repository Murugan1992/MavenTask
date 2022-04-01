package org.stepdefinition;

import org.Task.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Snapdeal extends BaseClass{
	@Given("User has to be in the snapdeal page")
	public void user_has_to_be_in_the_snapdeal_page() {
		launchBrowser();
		launchUrl("https://www.snapdeal.com/");
	}

	@When("user has to search the product")
	public void user_has_to_search_the_product() {
	    
	}

	@When("user has to click the search button")
	public void user_has_to_click_the_search_button() {
	    
	}

	@Then("product will be appeared")
	public void product_will_be_appeared() {
	    
	}

}
