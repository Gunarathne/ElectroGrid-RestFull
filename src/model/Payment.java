package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
				public String readPayment()
				{ 
					 String output = ""; 
					 
					 try
					 { 
					
				     Connection con = connect(); 
					 if (con == null) 
					 { 
						 return "Error while connecting to the database for reading."; 
					 } 
					 
					 
					 // Prepare the html table to be displayed
					 output = "<table border='1'>"
					 		 + "<tr><th>User Name</th>" 
							 +"<th>Email</th>"
							 + "<th>Address</th>"
							 + "<th>Contact Number</th>" 
							 +"<th>Card Name</th>"
							 + "<th>Credit Card Number</th>"
							 + "<th>Expiry Date</th>"
							 + "<th>CVV</th>" 
							 + "<th>Update</th><th>Remove</th></tr>"; 
					 
					 String query = "select * from payment"; 
					 
					 Statement stmt = (Statement) con.createStatement(); 
					 ResultSet res = ((java.sql.Statement) stmt).executeQuery(query); 
					 
					 // iterate through the rows in the result set
					 while (res.next()) 
					 { 
						 String PaymentID = Integer.toString(res.getInt("PaymentID")); 
						 String Name = res.getString("Name"); 
						 String Email = res.getString("Email"); 
						 String Address = res.getString("Address"); 
						 String ContactNumber = res.getString("ContactNumber"); 
						 String CardName = res.getString("CardName"); 
						 String CreditCardNumber = res.getString("CreditCardNumber"); 
						 String ExpiryDate = res.getString("ExpiryDate"); 
						 String CVV = res.getString("CVV"); 
						 
						 // Add a row into the html table
						 output += "<tr><td>" + Name + "</td>"; 
						 output += "<td>" + Email + "</td>"; 
						 output += "<td>" + Address + "</td>";
						 output += "<td>" + ContactNumber + "</td>";
						 output += "<td>" + CardName + "</td>"; 
						 output += "<td>" + CreditCardNumber + "</td>"; 
						 output += "<td>" + ExpiryDate + "</td>";
						 output += "<td>" + CVV + "</td>";
						 
						 // buttons
						 output += "<td><input name='btnUpdate' " 
						 + " type='button' value='Update' onclick = ></td>"
						 + "<td><form method='post' action= 'updatePayment.jsp'>"
						 + "<input name='btnRemove' " 
						 + " type='submit' value='Delete'>"
						 + "<input name='BuyerID' type='hidden' " 
						 + " value='" + PaymentID + "'>" 
						 + "</form></td></tr>"; 
					 } 
					 
					// con.close(); 
					
					     // Complete the html table
					     output += "</table>"; 
					 } 
					 
					catch (Exception e) 
					 { 
						 output = "Error while reading the payment details."; 
						 System.err.println(e.getMessage()); 
					 } 
					
					
					return output; 
				}


}
