package Logonmysql.Base;

import java.sql.SQLException;

import org.testng.annotations.Test;

import Logonsql.PageObjects.LandingPage;


public class Login extends Base {
	
	@Test
	public void Logon() throws ClassNotFoundException, SQLException, InterruptedException
	{
		
		LandingPage a= new LandingPage(driver);
		a.Login(email, password1, title);
	}
	
	

}
