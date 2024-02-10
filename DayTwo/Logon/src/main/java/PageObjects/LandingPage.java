package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends Abstract {

	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(id="userEmail")
	WebElement email;
	@FindBy(id="userPassword")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement button;
	
	public void login(String emai, String pass)
	{
		email.clear();
		email.sendKeys(emai);
		password.clear();
		password.sendKeys(pass);
		button.click();
		
	}
	
}
