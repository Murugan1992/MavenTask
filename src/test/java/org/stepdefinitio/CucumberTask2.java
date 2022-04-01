package org.stepdefinitio;

import org.Task.BaseClass;
import org.pojo.PojoTask;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTask2 extends BaseClass {
	PojoTask p;

	@Given("user has to Registration Form")
	public void user_has_to_be_in_the_login_page() {
		launchBrowser();
		launchUrl("https://demoqa.com/automation-practice-form");
		maxWindow();
	}
	@When("user has to enter the firstname")
	public void user_has_to_enter_the_username() {
		p=new PojoTask();
			toFillTextBox(p.getFirstName(), "Murugan");
	  }
	@When("user has to enter the lastname")
	public void user_has_to_enter_the_password() {
		toFillTextBox(p.getLastName(), "Loganathan");
	}
	@Then("user can't navigate to the home page")
	public void user_can_t_navigate_to_the_home_page() {
		System.out.println("User Entered First Name and Last Name");
	 }
	}


