package CheckBox.Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	
	protected WebDriver driver;
	
	
	
	public Abstract(WebDriver driver2) {
		this.driver=driver2;
	}



	public void wait(By element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}

}
