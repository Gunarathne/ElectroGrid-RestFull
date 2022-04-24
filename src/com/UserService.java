package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.UserHandling;

@Path("/User")
public class UserService {
	UserHandling UserObj = new UserHandling();
	
	//
//		UserProfile userObj2 = new UserProfile();
	//  UserProfile userObj3 = new UserProfile();
//		UserProfile userObj4 = new UserProfile();
//		UserProfile userObj5 = new UserProfile();
	//	
		
		
		//insert user details
		@POST
		@Path("/form1")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
		@Produces(MediaType.TEXT_PLAIN)
		
	public String insertUser(
			                 @FormParam("name") String name,
	                         @FormParam("phoneNO") String pno, 
	                         @FormParam("email") String email,
	                         @FormParam("address") String address,
	                         @FormParam("accountNO") String accno)

	{
		String output = UserObj.insertUser( name, pno, email, address, accno);
		return output;
		}

		

		//Read user details
		@GET
		@Path("/readuser") 
		@Produces(MediaType.TEXT_HTML) 
		public String readUser() { 
			return UserObj.readUser(); 
		}
		
}
