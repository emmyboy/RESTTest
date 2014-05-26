package com.example.domain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	private String id;
	private String name;
	private String address;
	
	public Person()
	{
		
	}
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@GET
	@Path("id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@GET
	@Path("name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@GET
	public Person self()
	{
		return this;
	}
}
