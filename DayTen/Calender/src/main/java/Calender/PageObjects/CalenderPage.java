package Calender.PageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Calender.Abstract.Abstract;

public class CalenderPage extends Abstract {
	
	public CalenderPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='timeNavDatePicker']")
	WebElement drop;
	
	@FindBy(xpath="//div[@class='flatpickr-calendar animate open arrowTop arrowLeft']//div/div/input[@class='numInput cur-year']")
	WebElement Year;
	
	@FindBy(xpath="//div[@class='flatpickr-calendar animate open arrowTop arrowLeft']//select")
	WebElement Month;
	
	@FindBy(xpath="//span[@class='flatpickr-day ']")
	List<WebElement> li;
	
	@FindBy(xpath="//a[contains(text(), 'Live Demo')]")
	WebElement calender;
	
	
	public void goTOCalender()
	{
		calender.click();
		Set<String> handles= driver.getWindowHandles();
		for(String handle: handles)
		{
		driver.switchTo().window(handle);
	}
	}
	
	public void selectDate(String year, String month, String date) throws Exception
	{
		Thread.sleep(3000);
		drop.click();
		Year.click();
		Year.sendKeys(year);
		Month.click();
		Select month1= new Select(Month);
		month1.selectByVisibleText(month);
		li.stream().filter(a->a.getText().equalsIgnoreCase(date)).findFirst().orElse(null).click();
		
	}

}
