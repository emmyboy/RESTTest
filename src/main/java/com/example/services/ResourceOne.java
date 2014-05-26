package com.example.services;


import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.daoutils.PersonDAO;
import com.example.domain.PersonHandler;

@Path("one")
public class ResourceOne {
	
	@GET
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("personlist")
	public String getPersonList(@CookieParam("p") String p)
	{
		return PersonDAO.getAllPeople();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("person/{id}")
	public String getPerson(@PathParam("id") String a)
	{
		return PersonDAO.getPerson(a);	
		}
	
	@Path("person")
	public PersonHandler getPerson()
	{
		return new PersonHandler();
	}

}
