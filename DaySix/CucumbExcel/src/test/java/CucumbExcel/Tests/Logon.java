package CucumbExcel.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import cucumb.pageobjs.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logon  {
	
	WebDriver driver;
	String url, email, password;

	@Given("^I set up env")
	public void setUp() throws IOException
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Data.xlsx");
		XSSFWorkbook xs= new XSSFWorkbook(fi);
		XSSFSheet credentials=xs.getSheet("Credentials");
		url= credentials.getRow(1).getCell(0).getStringCellValue();
		email= credentials.getRow(1).getCell(1).getStringCellValue();
		password=credentials.getRow(1).getCell(2).getStringCellValue();
	}
	
	@Given("^I visit the url on chrome browser")
	public void visit() throws IOException
	{  
		
		driver.get(url);
	}
	
	@When("^I enter email is in email field")
	public void email()
	{
		landingPage a= new landingPage(driver);
		a.enterEmail(email);
		
	}
	
	@When("^I enter password in password field")
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
		a.HomeVisib(driver);
	}
	
	@And("^I close the browser")
	public void close()
	{
		landingPage a= new landingPage(driver);
		a.close();
	}
	

}
