package extentReports.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage extends Abstract {

	WebDriver driver;
	public HomePage(WebDriver driver, String text) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		this.text=text;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".card-body")
	List<WebElement> li;

	private String text;
	
	
	
	public void AddToCart()
	{
		
		WebElement driver2= li.stream().filter(p->p.findElement(By .tagName("b")).getText().equalsIgnoreCase(text)).findFirst().orElse(null);
		driver2.findElement(By .className("w-10")).click();
		Assert.fail("Intentional fail");
		driver.close();
	}

}
