package PageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import PageAction.CommonActions;

public class HomePage extends CommonActions {
	
	public static WebElement NewCustomerLabel = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
	public static WebElement CustomerName = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=\"text\"]"));
	public static WebElement GenderRadioButton = driver.findElement(By.xpath("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=\"radio\"]:nth-child(1)"));
	public static WebElement DOBDatePicker = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
	public static WebElement AddressTextArea = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea"));
	public static WebElement CustomerCity = driver.findElement(By.xpath("<input type=\"text\" name=\"city\" maxlength=\"25\" onkeyup=\"validateCity();\" onblur=\"validateCity();\">"));
	public static WebElement CustomerState = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input"));
	public static WebElement CustomerPIN = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input"));
	public static WebElement CustomrerMobile = driver.findElement(By.xpath("<input type=\"text\" name=\"telephoneno\" maxlength=\"15\" onkeyup=\"validateTelephone();\" onblur=\"validateTelephone();\">"));
	public static WebElement CustomereMail = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input"));
	public static WebElement CustomerPassword = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input"));
	public static WebElement FormSubmitButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]"));
	
}
