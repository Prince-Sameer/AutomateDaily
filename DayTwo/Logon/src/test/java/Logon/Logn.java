package Logon;

import org.testng.annotations.Test;

import PageObjects.LandingPage;


public class Logn extends Base {

  
  @Test
  public void ChechLogin()  {
	  
	  LandingPage a= new LandingPage(driver);
	  a.login(email, pass);
	  
  }
}
