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
		
		waitElementToAppear(driver.findElement(By.className("inventory_item")));
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(xpath="//div[@class='inventory_item']")
	List<WebElement> li;
	
	
	public void Add_to_cart(String text)
	{
		
		System.out.println(li.isEmpty());
		
		WebElement driver2= li.stream().filter(p->p.findElement(By.className("inventory_item_name")).getText().equalsIgnoreCase(text)).findFirst().orElse(null);
		driver2.findElement(By .className("btn_small")).click();
	}
	
	public void remove_from_cart(String text)
	{
		WebElement driver2= li.stream().filter(p->p.findElement(By.className("inventory_item_name")).getText().equalsIgnoreCase(text)).findFirst().orElse(null);
		wait(driver2.findElement(By .className("btn_small")));
	    driver2.findElement(By .className("btn_small")).click();
	}
	
	

}
