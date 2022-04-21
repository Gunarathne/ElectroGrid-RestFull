package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Admin;

@Path("/Admin")
public class AdminService {
	
	Admin adminObj = new Admin();
	
	@POST
	@Path("/addNotice")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces(MediaType.TEXT_PLAIN)
	public String insertAccountBuyer(@FormParam("ncontent") String ncontent){ 
		
		String output = adminObj.insertNotice(ncontent); 
		
		return output; 
	}
	
}
