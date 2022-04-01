package org.stepdefinition;
import java.util.List;

import org.Task.BaseClass;
import org.pojo.PojoTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class StepDefinitionClass extends BaseClass {
PojoTask p;
@Given("user has to be in the login page")
public void user_has_to_be_in_the_login_page() {
	
	launchUrl("https://www.facebook.com/");
	
}
@When("user has to enter the username and enter the password")
public void user_has_to_enter_the_username_and_enter_the_password(DataTable d) {
   List<String> l = d.asList();
   String user = l.get(0);
   String pass = l.get(1);
   p= new PojoTask();
   toFillTextBox(p.getTxtUser(), user);
   toFillTextBox(p.getTxtPass(), pass);
		   
}

@When("user has to click the login button")
public void user_has_to_click_the_login_button() {
	btnClick(p.getBtnLogin());
}
@Then("user can't navigate to the home page")
public void user_can_t_navigate_to_the_home_page() {
	System.out.println("User Can't navigate");

}
}
