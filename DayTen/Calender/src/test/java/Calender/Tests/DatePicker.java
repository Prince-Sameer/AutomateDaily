package Calender.Tests;

import org.testng.annotations.Test;

import Calender.Base.Base;
import Calender.PageObjects.CalenderPage;

public class DatePicker extends Base {

	@Test
	public void selectDate()
	{
		CalenderPage p= new CalenderPage(driver);
		p.selectDate(year, month, date);
	}
	
}
