package cucumb.pageobjs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage extends Abstract {
   
	
	public landingPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement button;
	
	@FindBy(tagName="b")
	WebElement text;
	
	
	
	public void enterEmail(String mail)
	{
		email.clear();
		email.sendKeys(mail);
	}
	
	public void enterPass(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	
	public void click()
	{
		button.click();
	}
	
	public void HomeVisib()
	{
		wait(text);
	}
	public void close()
	{
		driver.close();
	}
}
