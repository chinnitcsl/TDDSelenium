package StepDefinition;

import PageAction.CreateNewCustomerActions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewCustomerSteps {
	CreateNewCustomerActions loginPageActions = new CreateNewCustomerActions();
	
	@Given("^Enter the Customer details$")
	public void enter_the_Customer_details() throws Throwable {
		loginPageActions.createCustomer();	   
	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
		loginPageActions.submitForm();
	    throw new PendingException();
	}

	@Then("^New customer created$")
	public void new_customer_created() throws Throwable {
	    System.out.println("New customer created");
	    throw new PendingException();
	}

}
