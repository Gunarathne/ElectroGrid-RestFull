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
	 con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrogrid", "root", ""); 
	 //For testing
	 System.out.println("Successfully connected to database"); 
	 } 
	 catch(Exception e) 
	 { 
	 e.printStackTrace(); 
	 } 
	 
	 return con; 
	}
	
//===========================================================================================================
//===========================================================================================================
	


	//inserting
		public String insertNotice(String noticeContent, String issuedate) {
			String output = " ";
			
			try {
				
				Connection con = connect(); 
				 if (con == null) 
				 {return "Error while connecting to the database for inserting."; } 
				 // create a prepared statement
				 String query = " insert into notices(`nid`,`ncontent`,`issuedate`)"
				 + " values (?, ?, ?)"; 
				 PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setInt(1, 0); 
				 preparedStmt.setString(2, noticeContent); 
				 preparedStmt.setString(3, issuedate); 
				  
				 
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