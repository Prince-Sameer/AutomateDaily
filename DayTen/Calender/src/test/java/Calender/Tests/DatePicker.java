package Calender.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Calender.Base.Base;
import Calender.PageObjects.CalenderPage;
import junit.framework.Assert;


public class DatePicker extends Base {

	
	@Test
	public void selectDate() throws Exception
	{
		CalenderPage p= new CalenderPage(driver);
		p.goTOCalender();
		p.selectDate(year, month, date);
		
	}
	
}
