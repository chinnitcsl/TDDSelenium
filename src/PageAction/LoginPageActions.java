package PageAction;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageActions extends CommonActions {
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinn\\Desktop\\BDD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openLoginDemoSite() {
		driver.get("http://demo.guru99.com/v4/");
	}

	public void loginToDemoPage() {
		PageLocators.LoginPage.LoginUsername.sendKeys("mngr190639");
		PageLocators.LoginPage.LoginPassword.sendKeys("gyjAnut");
		PageLocators.LoginPage.LoginButton.click();
		System.out.println("This is a sample note");
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
