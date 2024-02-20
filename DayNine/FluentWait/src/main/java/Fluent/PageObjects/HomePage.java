package Fluent.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fluent.Abstract.Abstract;

public class HomePage extends Abstract {
	
	public HomePage(WebDriver driver) throws InterruptedException
	{
		super(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("return navigator.webdriver = false;");
		
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(css="div.inventory_item")
	List<WebElement> li;
	
	WebElement driver2= li.stream().filter(p->p.findElement(By.className("inventory_item_name")).getText().equalsIgnoreCase("Sauce Labs Bolt T-Shirt")).findFirst().orElse(null);
	
	public void Add_to_cart()
	{
		driver2.findElement(By .className("btn_small")).click();
	}
	
	public void remove_from_cart()
	{
		wait(driver2.findElement(By .className("btn_small")));
		driver2.findElement(By .className("btn_small")).click();
	}
	
	

}
