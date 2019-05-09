package PageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import PageAction.CommonActions;

public class LoginPage extends CommonActions {

	public static WebElement LoginUsername = driver.findElement(By.name("uid"));
	public static WebElement LoginPassword = driver.findElement(By.name("password"));
	public static WebElement LoginButton = driver.findElement(By.name("btnLogin"));
	
}
