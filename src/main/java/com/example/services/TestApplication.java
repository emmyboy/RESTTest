package com.example.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("v1")
public class TestApplication extends Application{

	Set<Class<?>> resources= new HashSet<Class<?>>();
	Set<Object> singletons=new HashSet<Object>();
	
	public TestApplication()
	{
		singletons.add(new com.example.services.ResourceOne());
	}
	
//	@Override
//	public Set<Class<?>> getClasses() {
//		//resources.add(com.ngc.services.ResourceOne.class);
//		return resources;
//	}
	
//	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
