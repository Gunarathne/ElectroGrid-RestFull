package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Payment {
	
	// Connect to the DB
		public Connection connect() {
			Connection con = null;

			try {
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentdatabase", "root", "");

				// For testing
				System.out.print("Succesfully connected to the DB");
				
			}

			catch (Exception e) {
				e.printStackTrace();
			}

			return con;

		}

		         //Insert Buyers
				public String insertPayment(String username, String email, String address, String connumber, String cname, String cardno, String expdate, String cvv)
				{ 
					Connection con = connect();
					String output = "";
					try
					 { 
						  
						 if (con == null) 
						 { 
						    return "Error while connecting to the database"; 
						 } 
						 
						 // create a prepared statement
						 String query = " insert into payment (`PaymentID`,`Name`,`Email`,`Address`,`ContactNumber`,`CardName`,`CreditCardNumber`,`ExpiryDate`,`CVV`)"+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
						 
						 PreparedStatement Pstatement = con.prepareStatement(query); 
						 
						 // binding values
						 Pstatement.setInt(1, 0); 
						 Pstatement.setString(2, username); 
						 Pstatement.setString(3, email); 
						 Pstatement.setString(4, address); 
						 Pstatement.setString(5, connumber);
						 Pstatement.setString(6, cname);
						 Pstatement.setString(7, cardno);
						 Pstatement.setString(8, expdate);
						 Pstatement.setString(9, cvv);
						 
						 
						//execute the statement
						 
						 Pstatement.execute(); 
						 con.close();
						 System.out.println(query);
						 
						 output = "Payment Inserted successfully"; 
					 } 
					
					catch (Exception e) 
					 { 
						 output = "Error while inserting"; 
						 
						System.err.println(e.getMessage()); 
					 } 
					//binding values
					return output; 
				}



}
