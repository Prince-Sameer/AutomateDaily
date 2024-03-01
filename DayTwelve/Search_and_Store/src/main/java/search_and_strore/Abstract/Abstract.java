package search_and_strore.Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	
	protected WebDriver driver;
	
	public Abstract(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void wait(By links)
	{
		WebDriverWait ab= new WebDriverWait(driver, Duration.ofSeconds(30));
		ab.until(ExpectedConditions.presenceOfAllElementsLocatedBy(links));
	}
	
	public void waitjs()
	{
		WebDriverWait ab= new WebDriverWait(driver, Duration.ofSeconds(30));
		ab.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete';"));
	}

}
