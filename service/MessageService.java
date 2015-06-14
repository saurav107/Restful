package com.restfull.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restfull.Greeting;
import com.restfull.model.message;



@Path("/greet")
public class MessageService {

	Greeting greet = new Greeting();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	
	public List<message> greeting(){
		
	return greet.getGreeting();	
		
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
   public String messageId(@PathParam("id")long id){
	return "test" + id;
		
	}
}
