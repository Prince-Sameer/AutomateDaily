package extentReports.Tests;

import org.testng.annotations.Test;

import extentReports.PageObjects.HomePage;
import extentReports.PageObjects.LandingPage;

public class Tests extends Base {
	
	HomePage h;
	@Test
	public void login()
	{
		LandingPage a = new LandingPage(driver);
		h=a.Login(email, pass, prod);
	}
	@Test(dependsOnMethods= {"login"})
	public void addToCart()
	{
		h.AddToCart();
	}

}
