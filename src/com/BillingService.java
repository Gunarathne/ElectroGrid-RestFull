package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Billing;



@Path("/Bill")
public class BillingService {
	
Billing billobj = new Billing();
	

	@POST
	@Path("/AddBill")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces(MediaType.TEXT_PLAIN)
	public String insertUnitCount(@FormParam("AccountNumber") String AccountNumber, 
								  @FormParam("name") String name, 
								  @FormParam("unitCount") String unitCount, 
								  @FormParam("month") String month,
								  @FormParam("bamount") String bamount )
								  {
								 
		
		String output = billobj.insertUnitCount(AccountNumber, name, unitCount, month,bamount); 
		
		return output; 
	}
	
	
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String readUnitCount() {
		return billobj.readUnitCount();
	}
	

}
