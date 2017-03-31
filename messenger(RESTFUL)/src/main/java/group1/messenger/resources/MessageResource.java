package group1.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import group1.messenger.model.*;
import group1.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService ms = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> method1(){
		
		return ms.getAllMessages();
		
	}
	
	
	
}
