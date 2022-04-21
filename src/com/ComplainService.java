package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Complain;

@Path("/Complain")
public class ComplainService {
	
	Complain comObj = new Complain();
	
	//insert Complain details
	@POST
	@Path("/form1")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	
	public String insertComplain( 
			 @FormParam("Description") String Description) 
			
	{
		String output = comObj.insertComplain(Description);
		System.out.println(output);
		return output;
		
	
	}
	

	
	
}
