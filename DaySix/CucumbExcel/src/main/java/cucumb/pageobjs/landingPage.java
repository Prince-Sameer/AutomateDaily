package cucumb.pageobjs;
import org.openqa.selenium.By;
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
	
	public void HomeVisib(WebDriver driver)
	{   
		wait(driver.findElement(By.xpath("(//h5/b)[1]")));
	}
	public void close()
	{
		driver.close();
	}
}
