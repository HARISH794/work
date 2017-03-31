package group1.messenger.service;

import java.util.*;

import group1.messenger.model.*;

public class MessageService {

	
		
	public List<Message> getAllMessages(){
		
		
		Message m1 = new Message(1L, "hello" , "hari");
		Message m2 = new Message(2L, "hai", "hareesh");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
		
			
}
