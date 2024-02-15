package CucumbExcel.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import cucumb.pageobjs.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logon extends Base {
	
	@Given("^I visit the url on chrome browser")
	public void visit() throws IOException
	{  
		Logon a = new Logon();
		a.setUp();
		driver.get(url);
	}
	
	@When("^I enter email is in email field")
	public void email()
	{
		landingPage a= new landingPage(driver);
		a.enterEmail(email);
		
	}
	
	@When("^I enter password is in password field")
	public void pass()
	{
		landingPage a= new landingPage(driver);
		a.enterPass(password);
		
	}
	
	@And("^I click on the login button")
	public void click()
	{
		landingPage a= new landingPage(driver);
		a.click();
	}
	
	@Then("^I am able to see the homepage")
	public void homepage()
	{
		landingPage a= new landingPage(driver);
		Assert.assertTrue(true);
		a.HomeVisib();
	}
	
	@And("^I close the browser")
	public void close()
	{
		landingPage a= new landingPage(driver);
		a.close();
	}
	

}
