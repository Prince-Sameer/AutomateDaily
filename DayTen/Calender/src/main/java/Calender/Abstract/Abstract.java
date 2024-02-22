package Calender.Abstract;

import java.time.Duration;

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
	 
	 public void waiForElementToBeClickable(WebElement element)
	 {
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 
		 
	 }
	 public void waiForElementToBeVisible(WebElement element)
	 {
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOf(element));
		 
		 
	 }
}
