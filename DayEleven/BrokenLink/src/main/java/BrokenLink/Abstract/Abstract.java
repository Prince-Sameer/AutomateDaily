package BrokenLink.Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	
	protected WebDriver driver;
	public Abstract(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitElementToBePresent(By element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
		
	}
	
	public void scrollTo(WebElement element)
	{
		Actions action = new Actions(driver);
		action.scrollToElement(element).build().perform();
	}

}
