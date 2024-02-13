package Logonmysql.Base;

import org.openqa.selenium.WebDriver;

import java.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Base {
	
	   
	    public static void main(String args[])
	        throws SQLException, ClassNotFoundException
	    {
	        String driverClassName
	            = "sun.jdbc.odbc.JdbcOdbcDriver";
	        String url = "https:localhost/3306";
	        String username = "root";
	        String password = "Ahmed@1426";
	        String query
	            = "use LoginDB,"
	            		+ "select url from LoginTable";
	 
	        // Load driver class
	        Class.forName(driverClassName);
	 
	        // Obtain a connection
	        Connection con = DriverManager.getConnection(
	            url, username, password);
	 
	        // Obtain a statement
	        Statement st = con.createStatement();
	 
	        // Execute the query
	        int count = st.executeUpdate(query);
	        System.out.println(
	            "number of rows affected by this query= "
	            + count);
	 
	        // Closing the connection as per the
	        // requirement with connection is completed
	        con.close();
	    }

}
