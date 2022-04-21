package model;

import java.sql.*;

public class Admin {
	
	
//connection to db
	public Connection connect() 
	{ 
	 Connection con = null; 
	 
	 try 
	 { 
	 Class.forName("com.mysql.jdbc.Driver"); 
	 con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electro", "root", ""); 
	 //For testing
	 System.out.print("Successfully connected"); 
	 } 
	 catch(Exception e) 
	 { 
	 e.printStackTrace(); 
	 } 
	 
	 return con; 
	} 

	public String insertNotice(String noticeContent) {
		String output = " ";
		
		try {
			
			Connection con = connect(); 
			 if (con == null) 
			 {return "Error while connecting to the database for inserting."; } 
			 // create a prepared statement
			 String query = " insert into notice(`nid`,`ncontent`)"
			 + " values (?, ?)"; 
			 PreparedStatement preparedStmt = con.prepareStatement(query); 
			 // binding values
			 preparedStmt.setInt(1, 0); 
			 preparedStmt.setString(2, noticeContent); 
			  
			 
			// execute the statement
			 preparedStmt.execute(); 
			 con.close(); 
			 output = "Inserted successfully";
			
		}catch(Exception e){
			output = "Error in adding new notice";
			System.err.println(e.getMessage()); 
		}
		return output;
	}

}