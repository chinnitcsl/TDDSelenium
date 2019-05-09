package StepDefinition;

import PageAction.LoginPageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;;

public class LoginPageSteps {
	
	LoginPageActions loginPageActions = new LoginPageActions();
	
	@Given("^Open the Chrome browser$")
	public void open_the_Chrome_browser() {
		loginPageActions.launchBrowser();	    
	}

	@And("^launch the application$")
	public void launch_the_application() {
		loginPageActions.openLoginDemoSite();	    
	}
	
	@When("^Enter the username and password$")					
	public void enter_the_Username_and_Password() {
		loginPageActions.loginToDemoPage();		
	}		

	@Then("^Reset the credential$")					
	public void Reset_the_credential() throws Throwable {    
		//loginPageActions.closeBrowser();	
	}
	
}
