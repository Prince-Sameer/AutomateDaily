package cucumb.stepdef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Cucumb.Abstract.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logon {
	
	WebDriver driver;
	
	@Given("^I visited the url (.+) on the browser (.+)")
	public void I_visited_the_url_on_the_browser(String url, String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver =new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.print("Please update the browser value in feature file");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@When("^I fill the (.+) in the email field")
	public void I_fill_the_email(String email)
	{
		LandingPage a= new LandingPage(driver);
		a.sendEmail(email);
	}
	@When("^I fill the (.+) in password field")
	public void I_fill_the_password(String pass)
	{
		LandingPage a= new LandingPage(driver);
		a.sendPass(pass);
	}
	@When("^I click on Logon button")
	public void click() throws InterruptedException
	{   LandingPage a= new LandingPage(driver);
		a.click();
	}
	@Then("^I verify the (.+) of Homepage")
	public void I_verify(String title)
	{
		
		Assert.assertEquals(driver.getTitle(), title);
		driver.close();
	}

}
