package Calender.PageObjects;

import java.util.List;

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
	
	@FindBy(xpath="//input[@id='timeNavMobileDatePicker']/ancestor::div[@class='body']")
	WebElement drop;
	
	@FindBy(css=".flatpickr-month")
	WebElement picker;
	
	@FindBy(css=".flatpickr-monthDropdown-months")
	WebElement monthdropdown;
	
	@FindBy(css="flatpickr-days")
	WebElement datepicker;
	
	@FindBy(xpath="//span[@class='flatpickr-day ']")
	List<WebElement> li;
	
	public void selectDate(String year, String month, String date)
	{
		Actions act = new Actions(driver);
		waiForElementToBeVisible(drop);
		act.moveToElement(drop).moveByOffset(0, 0).click().build().perform();
		
		
		waiForElementToBeClickable(picker);
		picker.sendKeys(year);
		Select month1= new Select(monthdropdown);
		month1.selectByVisibleText(month);
		waiForElementToBeClickable(datepicker);
		li.stream().filter(a->a.getText().equalsIgnoreCase(date)).findFirst().orElse(null).click();
		driver.close();
		
		
		
		
		
	}

}
