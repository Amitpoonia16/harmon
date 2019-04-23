package testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://t25225-s38339.sandbox.mozu.com/");
		driver.navigate().refresh();
		
	Set<Cookie> cook=	driver.manage().getCookies();
	
	System.out.println("Cookies size is "+cook.size());
	
	for(Cookie cookie:cook)
	{
		System.out.println("Cookie name - " +cookie.getName());
		System.out.println("Cookie Domian - " +cookie.getDomain());
		System.out.println("Cookie Path - " +cookie.getPath());
		System.out.println("Cookie value - " +cookie.getValue());
		System.out.println("Cookie Expiry - " +cookie.getExpiry());
		System.out.println("=================");
	}
	
	driver.manage().deleteAllCookies();
	
Set<Cookie> cook1=	driver.manage().getCookies();
	
	System.out.println("Cookies size is "+cook1.size());
	}

}
