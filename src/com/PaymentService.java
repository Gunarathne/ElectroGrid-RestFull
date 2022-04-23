package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import model.Payment;

@Path("/Payments")
public class PaymentService {
Payment payment = new Payment();
	
	//InserPayment() method
	
	@POST
	@Path("/AddPayment") 
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces(MediaType.TEXT_PLAIN) 
	public String insertBuyer(@FormParam("Name") String Name, 
	 @FormParam("Email") String Email, 
	 @FormParam("Address") String Address, 
	 @FormParam("ContactNumber") String ContactNumber, 
	 @FormParam("CardName") String CardName, 
	 @FormParam("CreditCardNumber") String CreditCardNumber, 
	 @FormParam("ExpiryDate") String ExpiryDate, 
	 @FormParam("CVV") String CVV) 
	
	{ 
	 String output = payment.insertPayment(Name,Email,Address,ContactNumber,CardName,CreditCardNumber,ExpiryDate,CVV); 
	 return output; 
	}
	
	
	//RetrievePayment() method
	
	@GET
	@Path("/RetrievePayment")
	@Produces(MediaType.TEXT_HTML)
	public String readPayment() {
		return payment.readPayment();
	}

	//updatePayment() method
	
		@PUT
		@Path("/UpdatePayment") 
		@Consumes(MediaType.APPLICATION_JSON) 
		@Produces(MediaType.TEXT_PLAIN) 
		public String updatePayment(String paymentData) 
		{ 
		//Convert the input string to a JSON object 
		 JsonObject payObj = new JsonParser().parse(paymentData).getAsJsonObject(); 
		//Read the values from the JSON object
		 String PaymentID = payObj.get("PaymentID").getAsString(); 
		 String Name = payObj.get("Name").getAsString(); 
		 String Email = payObj.get("Email").getAsString(); 
		 String Address = payObj.get("Address").getAsString(); 
		 String ContactNumber = payObj.get("ContactNumber").getAsString(); 
		 String CardName = payObj.get("CardName").getAsString(); 
		 String CreditCardNumber = payObj.get("CreditCardNumber").getAsString(); 
		 String ExpiryDate = payObj.get("ExpiryDate").getAsString();
		 String CVV = payObj.get("CVV").getAsString(); 
		 String output = payment.updatePayment(PaymentID,Name,Email,Address,ContactNumber,CardName,CreditCardNumber,ExpiryDate,CVV); 
		
		 return output; 
		}
	
}
