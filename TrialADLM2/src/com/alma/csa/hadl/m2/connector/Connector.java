package com.alma.csa.hadl.m2.connector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public abstract class Connector {
	
	
	protected ArrayList<CallerRole> callerRoles;
	protected ArrayList<CalledRole> calledRoles;
	protected Glue glue;
	protected String name;
	
	public Connector(String name){
		callerRoles = new ArrayList<CallerRole>();
		calledRoles = new ArrayList<CalledRole>();
		glue = new Glue();
		this.name = name;
	}
}
