package com.example.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("v1")
public class TestApplication extends Application{

	Set<Class<?>> resources= new HashSet<Class<?>>();
	
	@Override
	public Set<Class<?>> getClasses() {
		resources.add(com.example.services.ResourceOne.class);
		return resources;
	}
}
