package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objtrep.login_data;

public class login {


	@Test
	public void user_login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://t25225-s38339.sandbox.mozu.com/");
		driver.navigate().refresh();
		login_data u_login=new login_data(driver);
		
		
		u_login.login_linkmtd().click();
		
		u_login.email_idmtd().sendKeys("akumar1@stegtechnologies.com");
		u_login.passwordmtd().sendKeys("akumar1@stegtechnologies.com");
		u_login.submitmtd().click();;
	}
}
