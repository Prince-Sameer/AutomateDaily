package serach_and_store.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import search_and_strore.Abstract.Abstract;

public class SearchPage extends Abstract {

	public SearchPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="APjFqb")
	WebElement searcharea;
	
	public void Search()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
	}
}
