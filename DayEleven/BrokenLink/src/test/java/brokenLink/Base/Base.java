package brokenLink.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	@DataProvider(name="url")
	public Object[][] getUrl()
	
	{
		return new Object[][] {
			{
			"https://rahulshettyacademy.com/AutomationPractice/"
			
		}
				
	};
	}

}
