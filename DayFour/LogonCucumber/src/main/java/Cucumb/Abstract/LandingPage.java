package Cucumb.Abstract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends Abstarct {
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
	WebElement pass;
	@FindBy(css="input[type='submit']")
	WebElement button;
	
	
	
	public void sendEmail(String mail)
	{
		email.clear();
		email.sendKeys(mail);
	}
	
	public void sendPass(String pas)
	{
		pass.clear();
		pass.sendKeys(pas);
	}
	public void click() throws InterruptedException
	{
		button.click();
		Thread.sleep(1000);
	}

}
