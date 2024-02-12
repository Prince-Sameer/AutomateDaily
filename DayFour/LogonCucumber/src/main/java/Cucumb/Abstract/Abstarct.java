package Cucumb.Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstarct {
	
	WebDriver driver;
	
	public Abstarct(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	public void wait(By other)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(other));
		
	}

}
