package extentReports.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends Abstract {

	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
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
		return new HomePage(driver, Product);
	}
	
	

	
}
