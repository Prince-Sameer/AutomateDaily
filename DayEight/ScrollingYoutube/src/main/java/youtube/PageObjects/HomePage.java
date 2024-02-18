package youtube.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import youtube.Abstract.Abstract;

public class HomePage extends Abstract{
	By id = By .id("contents");
	By id2= By .id("player");
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".ytd-rich-item-renderer")
	WebElement video;
	
	
	public void scroll(int x, int y)
	{
		wait(id);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1000)");
		
		
		
	}
	
	public void click()
	{
		
		Actions a = new  Actions(driver);
		a.moveToElement(video).click().build().perform();
		wait(id2);
		driver.close();
	}

}
