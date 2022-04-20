package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Billing {
	
	
	//DB connection
	
		//establishing connection
			private Connection connect() { 
				
				Connection con = null; 
				try{ 
					Class.forName("com.mysql.jdbc.Driver"); 
			 
					//Provide the correct details: DBServer/DBName, username, password 
					con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrogrid_paf_project", "root", ""); 
				} catch (Exception e) {
					e.printStackTrace();
				} 
				return con; 
			}
		
		//read all the users account numbers
		
		//Add unit count 
			
	    //Add unit count to the user's account

		
		
}
