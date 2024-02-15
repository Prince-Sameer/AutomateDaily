package Logonsql.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	
	WebDriver driver;
	
	
	public Abstract(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}

	public void waitElementToAppear(String a) throws InterruptedException
	{
		Thread.sleep(300);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.titleIs(a));
		
		
	}
	

}
