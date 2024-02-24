package extentReports.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LandingPage extends Abstract {

	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	By id =By.id("toast-container");
	
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(css="input[type='submit']")
	WebElement button;
	
	public HomePage Login(String mail, String pass, String Product)
	{
		email.clear();
		email.sendKeys(mail);
		password.clear();
		password.sendKeys(pass);
		button.click();
		wait(id);
		Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/client/dashboard/dash");
		return new HomePage(driver, Product);
	}
	
	

	
}
