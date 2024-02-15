package cucumb.pageobjs;
import java.time.Duration;

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


	public void wait(WebElement a)
	{
		WebDriverWait wa= new WebDriverWait(driver, Duration.ofSeconds(30));
		wa.until(ExpectedConditions.textToBePresentInElement(a, "ZARA COAT 3"));
	}

}
