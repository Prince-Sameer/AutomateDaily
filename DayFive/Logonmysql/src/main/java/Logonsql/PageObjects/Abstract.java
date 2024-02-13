package Logonsql.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	
	WebDriver driver;
	
	public Abstract(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
	}

	public void waitElementToAppear(String a)
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.titleContains(a));
		
		
	}
	

}
