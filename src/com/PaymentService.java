package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Payment;

@Path("/Payments")
public class PaymentService {
Payment payment = new Payment();
	
	
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


}
