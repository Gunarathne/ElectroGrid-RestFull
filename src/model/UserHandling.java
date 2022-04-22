package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserHandling {
	
	//establishing connection
			private Connection connect() { 
				
				Connection con = null; 
				try{ 
					Class.forName("com.mysql.jdbc.Driver"); 
			 
					//Provide the correct details: DBServer/DBName, username, password 
					con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrogriddb", "root", ""); 
				} catch (Exception e) {
					e.printStackTrace();
				} 
				return con; 
			}
			
			//create user
			public String insertUser(String name, String pno, String email, String address, String accno) { 
				
				String output = ""; 
				
				try { 
					Connection con = connect(); 
					
					if (con == null) {
						return "Error while connecting to the database for inserting."; } 
						
						// create a prepared statement
						String query;
					
						query = " insert into userdb (`UID`,`name`,`phoneNO`,`email`,`address`,`accountNO`)" + " values (?, ?, ?, ?, ?, ?)"; 
						PreparedStatement preparedStmt = con.prepareStatement(query);
						 
						// binding values
						preparedStmt.setInt(1, 0); 
						preparedStmt.setString(2, name); 
						preparedStmt.setString(3, pno); 
						preparedStmt.setString(4, email); 
						preparedStmt.setString(5, address); 
						preparedStmt.setString(6, accno); 

						// execute the statement
						preparedStmt.execute(); 
						
						con.close(); 
						
						output = "Inserted successfully"; 
				} catch (Exception e) { 
					output = "Error while inserting the details."; 
					System.err.println(e.getMessage()); 
				}
				return output; 
			}  
		

}
