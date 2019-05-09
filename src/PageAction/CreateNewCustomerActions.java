package PageAction;

public class CreateNewCustomerActions {

	public void createCustomer() {
		PageLocators.HomePage.NewCustomerLabel.click();
		PageLocators.HomePage.CustomerName.sendKeys("Chinni");
		PageLocators.HomePage.GenderRadioButton.click();
		PageLocators.HomePage.DOBDatePicker.sendKeys("06151987");
		PageLocators.HomePage.AddressTextArea.sendKeys("4-73, School St, Singannagudem");
		PageLocators.HomePage.CustomerCity.sendKeys("Agiripalli");
		PageLocators.HomePage.CustomerState.sendKeys("Andhra Pradesh");
		PageLocators.HomePage.CustomerPIN.sendKeys("521211");
		PageLocators.HomePage.CustomrerMobile.sendKeys("+91-8807596100");
		PageLocators.HomePage.CustomereMail.sendKeys("chinnitcsl@gmail.com");
		PageLocators.HomePage.CustomerPassword.sendKeys("chinni123");	    
	}
	
	public void submitForm () {
		 PageLocators.HomePage.FormSubmitButton.click();
	}
	
}
