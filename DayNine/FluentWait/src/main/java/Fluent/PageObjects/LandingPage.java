package Fluent.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fluent.Abstract.Abstract;

public class LandingPage extends Abstract{

	public LandingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//div[@id='login_credentials']")
	WebElement Name;
	
	@FindBy(css=".login_password")
	WebElement Pass;
	
	@FindBy(css="input[type='submit']")
	WebElement button;
	
	public HomePage Login()
	{
		userName.clear();
		String[] s= Name.getText().split("\n");
		userName.sendKeys(s[1]);
		password.clear();
		String[] p= Pass.getText().split("\n");
		password.sendKeys(p[1]);
		button.click();
		
		return new HomePage(driver);
		
	}
	
	


	
	
}
