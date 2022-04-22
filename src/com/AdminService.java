package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import model.Admin;

@Path("/Admin")
public class AdminService {
	
	Admin adminObj = new Admin();
	
	@POST
	@Path("/addNotice")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces(MediaType.TEXT_PLAIN)
	public String insertAccountBuyer(@FormParam("ncontent") String ncontent, @FormParam("issuedate") String issuedate){ 
		
		String output = adminObj.insertNotice(ncontent, issuedate);
		
		
		return output; 
	}
	
	@GET
	@Path("/viewAllNotices") 
	@Produces(MediaType.TEXT_HTML) 
	public String viewNotices() { 
		return adminObj.viewNotices(); 
	}
	
	@DELETE
	@Path("/removenotice") 
	@Consumes(MediaType.APPLICATION_XML) 
	@Produces(MediaType.TEXT_PLAIN) 
	public String removeNotice(String noticedata) { 
		
		//Convert the input string to an XML document
		Document doc = Jsoup.parse(noticedata, "", Parser.xmlParser()); 
	 
		String nID = doc.select("nId").text(); 
		String output = adminObj.removeNotice(nID); 
	
		return output; 
	}
	
}
