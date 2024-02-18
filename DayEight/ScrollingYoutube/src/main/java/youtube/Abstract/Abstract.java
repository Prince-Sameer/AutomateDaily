package youtube.Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	  
	protected WebDriver driver;
	public Abstract(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void wait(By a)
{
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(a));
}

}
