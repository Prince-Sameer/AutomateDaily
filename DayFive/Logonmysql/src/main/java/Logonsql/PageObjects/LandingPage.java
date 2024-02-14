package Logonsql.PageObjects;

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
WebElement pass;

@FindBy(xpath="//input[@type='submit']")
WebElement button;

public void Login(String mail, String pas, String title)
{
	email.clear();
	email.sendKeys(mail);
	pass.clear();
	pass.sendKeys(pas);
	button.click();
	waitElementToAppear(title);
	driver.close();
	
}

}
