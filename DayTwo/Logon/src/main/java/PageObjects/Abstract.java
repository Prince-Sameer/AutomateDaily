package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	
	WebDriver driver;
	
	public Abstract(WebDriver driver) {
		
		this.driver=driver;
	}


	public void wait(int time, By element)
	{
	   WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(time));
	   wait.until(ExpectedConditions.presenceOfElementLocated(element));
	   
	}

}
