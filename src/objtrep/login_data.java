package objtrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_data {
WebDriver driver;
	
	public login_data(WebDriver driver)
	{
		this.driver=driver;
	}
	
	

	By login_link=By.xpath("//a[@class=\"login-link-text\"]");
	By email_id=By.id("email");
	By password=By.id("password");
	By submit=By.id("login-submit");
	
	public WebElement login_linkmtd()
	{
		return driver.findElement(login_link);
	}
	public WebElement email_idmtd()
	{
		return driver.findElement(email_id);
	}
	public WebElement passwordmtd()
	{
		return driver.findElement(password);
	}
	public WebElement submitmtd()
	{
		return driver.findElement(submit);
	}
}
