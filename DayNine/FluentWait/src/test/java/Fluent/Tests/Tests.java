package Fluent.Tests;

import org.testng.annotations.Test;

import Fluent.Base.Base;
import Fluent.PageObjects.HomePage;
import Fluent.PageObjects.LandingPage;

public class Tests extends Base {

	HomePage b;
	@Test
	public void Login() throws InterruptedException
	{
		LandingPage a= new LandingPage(driver);
		b=a.Login();
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void void_add_to_cart()
	{
		b.Add_to_cart();
	}
	
	@Test(dependsOnMethods={"void_add_to_cart"})
	public void remove()
	{
		b.remove_from_cart();
		driver.quit();
	}
	
}
