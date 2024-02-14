package Logonmysql.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.sql.*;

public class Base {
	
	   
	WebDriver driver;
	String email;
	String password1;
	String title;
	
        @BeforeTest
	    public void method()
	        throws SQLException, ClassNotFoundException
	    {
        	driver= new ChromeDriver();
        	driver.manage().window().maximize();
        	
	        String url = "localhost:3306/LoginDB";
	        String username = "root";
	        String password = "root";
	        String query="select * from LoginTable";
	 
	        // Load driver class
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        // Obtain a connection
	        Connection con = DriverManager.getConnection("jdbc:mysql://"+
	            url, username, password);
	        Statement st= con.createStatement();
	        ResultSet rs= st.executeQuery("select * from LoginTable");
	        rs.next();
	        driver.get(rs.getString("url"));
	        email=rs.getString("email");
	        password1=rs.getString("pass");
	        title= rs.getString("title");
	        
	        
	 
	        
	        
	        
	    }
	 
	        // Closing the connection as per the
	        // requirement with connection is completed
	        

}
