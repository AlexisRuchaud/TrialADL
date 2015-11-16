package com.alma.csa.hadl.m2.connector;

import java.util.HashMap;
import java.util.Map;


public abstract class Connector {
	

	protected Map<String, CallerRole> callerRole = new HashMap<String, CallerRole>();
	protected Map<String, CalledRole> calledRole = new HashMap<String, CalledRole>();
	

	private Glue glue = new Glue();

}
