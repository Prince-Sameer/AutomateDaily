package serach_and_store.PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath="//*[@title='Search']")
	WebElement searcharea;
	
	public SearchResult Search() throws Exception 
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		waitjs();
		String a= (String) js.executeScript("return window.prompt('enter data to be searched');");
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		searcharea.sendKeys(a);
		searcharea.sendKeys(Keys.ENTER);
		return new SearchResult(driver);
	}
}
