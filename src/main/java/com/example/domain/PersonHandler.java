package com.example.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class PersonHandler {
	
	private Map<String,Person> people=new HashMap<String,Person>();
	
	public PersonHandler()
	{
		people.put("1234",new Person("1234","john"));
		people.put("456",new Person("456","jack"));
		people.put("789",new Person("789", "Joe"));
	}

	@GET
	public Collection<Person> getAllPeople()
	{
		return people.values();
	}
	
	@Path("{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Person getPerson(@PathParam("id") String key)
	{
		return people.get(key);
	}

}
