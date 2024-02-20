package Fluent.Abstract;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Abstract {
	
	protected WebDriver driver;
	
	public Abstract(WebDriver driver)
	{
		this.driver=driver;
	}

	public void wait(WebElement element)
	{
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.textToBePresentInElement(element, "remove"));
	}
}
