package com.restfull;

import java.util.ArrayList;
import java.util.List;

import com.restfull.model.message;

public class Greeting {

	 message mess= new message();
	
	public List<message> getGreeting(){
		message mess = new message(1L,"Hari", "kamal");
		message mess1 = new message(2L,"shyam", "kamal");
		message mess2 = new message(3L,"Muna", "kamal");
		List<message> list = new ArrayList<>();
		list.add(mess);
		list.add(mess1);
		list.add(mess2);
		return list;
	}
	
public long getMessage(long id){
	
		return mess.getId();
	}

}
