package CheckBox.Tests;

import org.testng.annotations.Test;

import CheckBox.Base.Base;
import CheckBox.CheckBoxPage.*;

public class Tests extends Base{

	@Test
	public void selectCheck() throws InterruptedException
	{
		CheckBox c= new CheckBox(driver);
		c.check();
		driver.close();
	}
}
